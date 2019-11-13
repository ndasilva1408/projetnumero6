package org.sid.projetnumero6.controller;

import org.jetbrains.annotations.NotNull;
import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.TOPO;
import org.sid.projetnumero6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller

public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private TOPORepository topoRepository;


    @RequestMapping(value={"/memberList"},method = RequestMethod.GET)
    public String viewUserList(ModelMap model){

        model.put("memberList",memberRepository.findAll());
        return "memberList";

    }

    @RequestMapping(value = {"/pageperso"},method = RequestMethod.GET)
    public String viewPagePerso(ModelMap model){
        return "memberPage";

    }

    @RequestMapping(value={"/memberList"},method = RequestMethod.POST)
    public String changeRank(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String button=request.getParameter("button");
        userService.changeRank(button);

        return "index";

    }


    @PostMapping()
    public String addTopoToTopoOwner (HttpServletRequest request){
        TOPO topo;
        Member member;
        List<TOPO>topos = new ArrayList<TOPO>();
        List<Member>members= new ArrayList<Member>();
      
        String login= request.getParameter("topoOwner");
        String topoId = request.getParameter("topoId");

        Long id2=Long.parseLong(topoId);

        topo=topoRepository.findTOPOById(id2);

        member =memberRepository.findMemberByLoginEquals(login);
        topos.add (topo);
        members.add(member);

        member.setTopo(topos);

        topo.setMember(members);

        memberRepository.save(member);
        topoRepository.save(topo);

        return "memberPage";
    }



}




