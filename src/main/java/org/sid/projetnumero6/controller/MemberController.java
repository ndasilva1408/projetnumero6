package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.BookingRepository;
import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.TOPORepository;

import org.sid.projetnumero6.entities.Booking;
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


@Controller

public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private TOPORepository topoRepository;
    @Autowired
    private BookingRepository bookingRepository;


    @RequestMapping(value = {"/memberList"}, method = RequestMethod.GET)
    public String viewUserList(ModelMap model) {

        model.put("memberList", memberRepository.findAll());
        return "memberList";

    }
    @RequestMapping(value = {"/memberList"}, method = RequestMethod.POST)
    public String changeRank(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String button = request.getParameter("button");
        userService.changeRank(button);

        return "index";

    }


    @RequestMapping(value = {"/pageperso"}, method = RequestMethod.GET)
    public String viewPagePerso(ModelMap model) {


        return "memberPage";

    }

    @PostMapping(value = "/pageperso")
    public String reponseBooking(HttpServletRequest request) {
        String value = request.getParameter("value");
        String topo = request.getParameter("topoName");

        if (value.equals("oui")) {
            TOPO topo2 = topoRepository.findTOPOByName(topo);
            topo2.setAvailable(false);
            Booking booking = bookingRepository.findBookingsByTopo(topo2);
            booking.setDemandeEnCours(false);
            bookingRepository.save(booking);


        } else if(value.equals("non")) {

            TOPO topo2 = topoRepository.findTOPOByName(topo);
            Booking booking = bookingRepository.findBookingsByTopo(topo2);
            booking.setDemandeEnCours(false);
            topo2.setAvailable(true);
            bookingRepository.delete(booking);
        }
        else{
            TOPO topo2 = topoRepository.findTOPOByName(topo);
            Booking booking=bookingRepository.findBookingsByTopo(topo2);
            topo2.setAvailable(true);
            topoRepository.save(topo2);
            bookingRepository.delete(booking);

        }

        return "index";
    }




}




