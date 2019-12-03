package org.sid.projetnumero6.service;

import org.sid.projetnumero6.dao.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;

@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    @Autowired
    HttpSession session;

    @Autowired
    MemberRepository memberRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
            throws IOException, ServletException {

            String userName = "";
            if(authentication.getPrincipal()instanceof Principal){
                userName = ((Principal) authentication.getPrincipal()).getName();
            }else {
                userName = ((User) authentication.getPrincipal()).getUsername();
            }
            authentication.getAuthorities();
             HttpSession session = request.getSession();
             session.setAttribute("member", (memberRepository.findMemberByLoginEquals(userName)));
             session.setAttribute("topo", (memberRepository.findMemberByLoginEquals(userName)).getTopo());
             session.setAttribute("booking", (memberRepository.findMemberByLoginEquals(userName).getBookingDemandList()));
             session.setAttribute("demandBooking", (memberRepository.findMemberByLoginEquals(userName).getBookingList()));
             session.setAttribute("demande", (memberRepository.findMemberByLoginEquals(userName).isDemandeDePret()));
             session.setAttribute("rang",(memberRepository.findMemberByLoginEquals(userName).getRole().getRang()));


        response.sendRedirect( "/index");


    }

}
