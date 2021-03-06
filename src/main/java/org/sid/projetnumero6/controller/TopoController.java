package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.ClimbPathRepository;
import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.PlaceRepository;
import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Place;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class TopoController {
    @Autowired
    TOPORepository topoRepository;
    @Autowired
    PlaceRepository placeRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    ClimbPathRepository climbPathRepository;


    Place place;
    TOPO topo;


    // Liste des topos + recherche
    @RequestMapping(value = {"/regionList"}, method = RequestMethod.GET)
    public String viewTOPOlist(ModelMap model,
                               HttpServletRequest request,
                               @RequestParam(name = "page", defaultValue = "0") int p,
                               @RequestParam(name = "size", defaultValue = "2") int s)
            throws ServletException, IOException {

        String mc = request.getParameter("mc");
        String nr = request.getParameter("nr");

        if (mc != null || nr != null) {
            if (nr == "") {
                Page<TOPO> topos = topoRepository.findTOPOSByNameContainsIgnoreCase(mc, new PageRequest(p, s));
                model.put("topoList", topos.getContent());
            }
            if (mc == "") {
                List<ClimbPath> cPathList = climbPathRepository.searchByLvl(nr);


                for (int i = 0; i < cPathList.size(); i++) {

                    List<ClimbPath> cPathList2 = new ArrayList<>();
                    cPathList2.add(cPathList.get(i));


                    Page<TOPO> topos = topoRepository.findTOPOSByClimbPathList(cPathList2, new PageRequest(p, s));


                    model.put("topoList", topos.getContent());
                }


            }
        } else {

            Page<TOPO> topos = topoRepository.findAll(new PageRequest(p, s));
            model.addAttribute("topoList", topos.getContent());

            int[] pages = new int[topos.getTotalPages()];
            model.addAttribute("pages", pages);

        }


        return "topobyPlace";

    }

    //Appel method delete
    @RequestMapping(value = {"/regionList"}, method = RequestMethod.POST)
    public String deleteTOPO(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String button = request.getParameter("button");
        Long button2 = Long.parseLong(button);

        topoRepository.deleteTOPOById(button2);


        return "index";

    }


    // Page creation nouveaux topo
    @RequestMapping(value = "/newtopo", method = RequestMethod.GET)
    public String createtopo(ModelMap model) {

        model.put("placeList", placeRepository.findAll());

        return "createTOPO";
    }


    //Page affichage TOPO
    @RequestMapping(value = "/topoRQPR", method = RequestMethod.GET)
    public String getTopoById(@RequestParam(value = "id", required = false) Long id, Model model) {

        topo = topoRepository.findTOPOById(id);
        model.addAttribute("topo", topo);


        return "detailsTOPO";
    }

    //Estampillage Officiel des amis de l'escalade
    @PostMapping("/topoRQPR")
    public String officialTopo(HttpServletRequest request) {
        String Official = request.getParameter("Officiel");
        String topo = request.getParameter("topoName");

        TOPO topo2 = topoRepository.findTOPOByName(topo);
        if (Official.equals("Officiel")) {
            topo2.setOfficiel(true);
            topoRepository.save(topo2);

        }


        return "index";
    }


    //Method pour creer un nouveau topo

    @RequestMapping(value = "/savetopo", method = RequestMethod.POST)
    public String savetopo(@Valid TOPO topo, BindingResult bindingResult, HttpServletRequest request) {
        Place topoPlace;
        Member member;
        List<TOPO> topos = new ArrayList<TOPO>();
        List<Member> members = new ArrayList<Member>();
        List<Place> places = new ArrayList<Place>();

//Recupération des parametres dans la JSP
        String placename = request.getParameter("placeName");
        String login = request.getParameter("topoOwner");

//On trouve les objets correspondant dans les Repository
        topoPlace = placeRepository.findByName(placename);
        member = memberRepository.findMemberByLoginEquals(login);


        members.add(member);
        topos.add(topo);
        places.add(topoPlace);


        //Et on les ajoutes pour créer les liaisons
        member.setTopo(topos);
        topo.setMember(members);
        topoPlace.setTopo(topos);
        topo.setPlace(places);
        topo.setAvailable(true);


        if (bindingResult.hasErrors())
            return "createTOPO";

        else {
            topoRepository.save(topo);
            memberRepository.save(member);
            placeRepository.save(topoPlace);
        }

        return "index";
    }


    //Methode de validation
    @RequestMapping(value = "/validtopo", method = RequestMethod.POST)
    public String validtopo(@Valid TOPO topo, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "createTOPO";
        else {
            topoRepository.save(topo);
            return "regionList";
        }
    }


}






