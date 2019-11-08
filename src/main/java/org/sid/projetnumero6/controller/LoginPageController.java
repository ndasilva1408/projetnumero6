package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@SessionAttributes("member")
public class LoginPageController {




    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/loginPage")

    public String loginPage() { return "loginPage";}

    //  Authentification
    @PostMapping("/Auth_login")
    public String savelogin(HttpServletRequest request, @Valid Member member , BindingResult bindingResult) {

        String login=request.getParameter("login");
        HttpSession session=request.getSession();



        try {
            if (bindingResult.hasErrors() ||
                    !member.getLogin().equals(memberRepository.findMemberByLoginEquals(member.getLogin()).getLogin())
                ||
                    !member.getPassword().equals(memberRepository.findMemberByLoginEquals(member.getLogin()).getPassword()))
                    {

                return "loginPage";
            }

        }
        catch (NullPointerException e){
            return "loginPage";
        }


        session.setAttribute("role",(memberRepository.findMemberByLoginEquals(login)).role.getAbreviation());
        session.setAttribute("login",login);

        return "memberPage";

}

    @GetMapping("/deconnect")

    public String deconnexion(HttpServletRequest request){
        request.getSession().invalidate();
        return "index";
    }







}
