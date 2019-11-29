package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Set;
import java.util.stream.Collectors;

@Configuration
@Controller
@SessionAttributes("member")
public class LoginPageController {


    @Autowired
    MemberRepository memberRepository;


    @RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
    public String loginPage() {

        return ("loginPage2");
    }

   /* @GetMapping({"/login","/"})

     public String loginPage() {
        return "loginPage2";
    }

   @PostMapping("/login")
    public String loginPage2() {
        return "index";
    }*/

    //  Authentification
    @PostMapping("/Auth_login")
    public String savelogin(HttpServletRequest request, @Valid Member member, BindingResult bindingResult) {

        String login = request.getParameter("username");
        HttpSession session = request.getSession();


        try {
            if (bindingResult.hasErrors() ||
                    !member.getLogin().equals(memberRepository.findMemberByLoginEquals(member.getLogin()).getLogin())
                    ||
                    !member.getPassword().equals(memberRepository.findMemberByLoginEquals(member.getLogin()).getPassword())) {

                return "loginPage";
            }

        } catch (NullPointerException e) {
            return "loginPage";
        }


        session.setAttribute("member", (memberRepository.findMemberByLoginEquals(login)));
        session.setAttribute("topo", (memberRepository.findMemberByLoginEquals(login)).getTopo());
        //session.setAttribute("role", (memberRepository.findMemberByLoginEquals(login)).getRole().getAbreviation());
        session.setAttribute("booking", (memberRepository.findMemberByLoginEquals(login).getBookingDemandList()));
        session.setAttribute("demandBooking", (memberRepository.findMemberByLoginEquals(login).getBookingList()));
        session.setAttribute("demande", (memberRepository.findMemberByLoginEquals(login).isDemandeDePret()));

        return "memberPage";

    }

    @GetMapping("/deconnect")
    public String deconnexion(HttpServletRequest request) {
        request.getSession().invalidate();
        return "loginPage";
    }


}
