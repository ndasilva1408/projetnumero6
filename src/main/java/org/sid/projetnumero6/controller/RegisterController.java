package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Roles;
import org.sid.projetnumero6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;


@Controller
public class RegisterController {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    UserService userService;


    // New Account
    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("member",new Member());
        return "register";
    }


    //Method pour creer un nouveau user

    @RequestMapping(value="/savemember",method = RequestMethod.POST)
    public String savemember( @Valid Member member, BindingResult bindingResult){
        member.setRole(Roles.INVITE);
        member.setNoteList(null);

        if (bindingResult.hasErrors())
            return "register";
        if (userService.isMemberAlreadyPresent(member)) {
            return "register";
        }else{
            memberRepository.save(member);
            return "Confirmation";
        }
    }



}
