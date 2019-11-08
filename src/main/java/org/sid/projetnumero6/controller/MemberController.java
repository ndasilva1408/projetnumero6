package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@Controller

public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private UserService userService;

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




}




