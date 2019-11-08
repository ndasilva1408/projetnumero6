package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.NoteRepository;
import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Note;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NoteController {
    @Autowired
    NoteRepository noteRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    TOPORepository topoRepository;


    Member member;
    TOPO topo;

    @PostMapping(value = "addComment")
    public String addComment(HttpServletRequest request, HttpServletResponse response, ModelMap model , Note note){

        String login= request.getParameter("login");

        //TODO : RQP TOPO ID ET LIER A l'OBJET NOTE.

        member = memberRepository.findMemberByLoginEquals(login);

        String comment = request.getParameter("comments");
        note.setText(comment);
        note.setMember(null);
        note.setPlace(null);

        noteRepository.save(note);

        topo.getNoteList().add(note);
        member.getNoteList().add(note);






    return"index"; }
}
