package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.BookingRepository;
import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.Booking;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;



@Controller
public class BookingController {
    @Autowired
    TOPORepository topoRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/detailsBooking")
    public String getBookingId(@RequestParam(value = "id", required = false) Long id,
                               @RequestParam(value = "topo.id") Long topoId,
                               Model model) {

        Member topoOwner = memberRepository.findMemberById(id);
        model.addAttribute("topoOwner", topoOwner);


        TOPO topo = topoRepository.findTOPOById(topoId);
        model.addAttribute("topo",topo);



        return "detailsBooking";
    }

    @PostMapping(value = "/demandBooking")
    public String demandBooking(HttpServletRequest request) {
        Booking booking = new Booking();

        String booker = request.getParameter("booker");
        String topoOwner = request.getParameter("topoOwner");
        String topoId = request.getParameter("topoId");


        Long topoId2=Long.parseLong(topoId);

        TOPO topo = topoRepository.findTOPOById(topoId2);

        Member member = memberRepository.findMemberByLoginEquals(booker);

        Member topoOwner2= memberRepository.findMemberByLoginEquals(topoOwner);

//TODO Message de reservation (Creer un boolean dans Booking "DemandeEnCours" , si off msg avec bouton pas affiche , si on , Demande avec bouton Oui Non
// TODO Oui -> Topo.available passe indispo pdt 1 semaine , "DemandeEnCours" passe false.
// TODO Non-> "DemandeEnCours" passe false et rien ne change.

        booking.setTopo(topo);
        booking.setBooker(member);
        booking.setOwner(topoOwner2);
        booking.demandeEnCours=true;
        booking.owner.setDemandeDePret(true);
        booking.topo.setAvailable(false);

        bookingRepository.save(booking);


    return "index";

    }
}
