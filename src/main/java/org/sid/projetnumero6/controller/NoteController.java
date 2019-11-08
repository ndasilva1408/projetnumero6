package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.NoteRepository;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class NoteController {
    @Autowired
    NoteRepository noteRepository;

    Note note;
    Member member;

    @GetMapping(value = "addComment")
    public String addComment(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        HttpSession session = request.getSession();
        session.getAttribute("member");

        model.addAttribute("note",new Note());
        model.addAttribute("member", member);
        request.getParameter("note");
        note.setText("note");


    return"topo"; }
}
