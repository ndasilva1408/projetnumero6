package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller

public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping(value={"/memberList"},method = RequestMethod.GET)
    public String viewUserList(ModelMap model){

        model.put("memberList",memberRepository.findAll());
        return "memberList";

    }

    @RequestMapping(value = {"/pageperso"},method = RequestMethod.GET)
    public String viewPagePerso(ModelMap model){
        return "memberPage";

    }




}




