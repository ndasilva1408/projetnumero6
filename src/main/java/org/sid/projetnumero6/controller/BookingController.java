package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BookingController {
    @Autowired
    TOPORepository topoRepository;
    @Autowired
    MemberRepository memberRepository;

    @PostMapping(value = "booking")
    public String demandBooking(HttpServletRequest request) {
        String login = request.getParameter("login");
        String topoId = request.getParameter("topoId");
        String topoOwner = request.getParameter("topoOwner");

        Long topoId2 = Long.parseLong(topoId);

        Member member = memberRepository.findMemberByLoginEquals(login);
        TOPO topo = topoRepository.findTOPOById(topoId2);
        Member topoOwner2= memberRepository.findMemberByLoginEquals(topoOwner);

//TODO Message de reservation (Creer un boolean dans Booking "DemandeEnCours" , si off msg avec bouton pas affiche , si on , Demande avec bouton Oui Non
// TODO Oui -> Topo.available passe indispo pdt 1 semaine , "DemandeEnCours" passe false.
// TODO Non-> "DemandeEnCours" passe false et rien ne change.

    return "index";

    }
}
