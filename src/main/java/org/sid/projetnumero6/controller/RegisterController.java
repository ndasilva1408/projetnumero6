package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.RolesRepository;
import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Roles;
import org.sid.projetnumero6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class RegisterController {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    UserService userService;
    @Autowired
    RolesRepository rolesRepository;





    // New Account
    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("member",new Member());
        return "register";
    }


    //Method pour creer un nouveau user

    @RequestMapping(value="/savemember",method = RequestMethod.POST)
    public String savemember(@Valid Member member, BindingResult bindingResult, HttpServletRequest request){

       BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        Roles role= rolesRepository.findRolesByRangEquals("INVITE");

        member.setRole(role);


        if (bindingResult.hasErrors())
            return "register";
        if (userService.isMemberAlreadyPresent(member)) {
            return "register";
        }else{
      String password2 = request.getParameter("password");
            String cryptedPassword= bCryptPasswordEncoder.encode(password2);
            member.setPassword(cryptedPassword);
            memberRepository.save(member);
            return "Confirmation";
        }
    }



}
