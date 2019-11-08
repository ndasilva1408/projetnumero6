package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.dto.TOPODTO;
import org.sid.projetnumero6.entities.Place;
import org.sid.projetnumero6.entities.TOPO;
import org.sid.projetnumero6.service.TopoService;
import org.sid.projetnumero6.service.TopoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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



@Controller
public class TopoController {
@Autowired
TopoService topoService;
@Autowired
 TOPORepository topoRepository;


Place place;
 TOPO topo   ;







    // Liste des topos
    @RequestMapping(value={"/regionList"},method = RequestMethod.GET)
    public String viewTOPOlist(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        model.put("topoList",topoRepository.findAll());


        return "topobyPlace";

    }
    //Appel method delete
    @RequestMapping(value={"/regionList"},method = RequestMethod.POST)
    public String deleteTOPO( HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        String button=request.getParameter("button");
        Long button2= Long.parseLong(button);

            topoRepository.deleteTOPOById(button2);


        return "index";

    }



    // Page creation nouveaux topo
    @RequestMapping(value="/newtopo",method = RequestMethod.GET)
    public String createtopo (){
            return "createTOPO";
        }


    //Page affichage TOPO
   @RequestMapping(value ="/topoRQPR",method =RequestMethod.GET)
    public String getTopoById (@RequestParam(value = "id" ,required = false)Long id, Model model)
  {

        topo=topoRepository.findTOPOById(id);
        model.addAttribute("topo",topo);


        return  "detailsTOPO" ;
    }




    //Method pour creer un nouveau topo

    @RequestMapping(value="/savetopo",method = RequestMethod.POST)
    public String savetopo(@Valid TOPO topo,ModelMap model,BindingResult bindingResult,HttpServletRequest request){
        topo.setPlace(null);
        topo.setAvailable(true);
        if (bindingResult.hasErrors())
            return "createTOPO";

       else

            topoRepository.save(topo);
            return "validTOPO";
        }


        //Methode de validation
    @RequestMapping(value="/validtopo",method = RequestMethod.POST)
    public String validtopo(@Valid TOPO topo,BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "createTOPO";
        else{
            topoRepository.save(topo);
            return "regionList";
        }
    }

    @PostMapping(value = "/chercher")
    protected String searchByMc(HttpServletRequest request, HttpServletResponse response,ModelMap model)
        throws  ServletException, IOException{


        return "regionList";
    }

    // Liste des topos
    @RequestMapping(value={"/topobyPlace"},method = RequestMethod.GET)
    public String viewTOPObyPlace(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    topoRepository.findTOPOSByPlace(place);


        model.put("topoList",topoRepository.findTOPOSByPlace( place ));


        return "topobyPlace";

    }



}






