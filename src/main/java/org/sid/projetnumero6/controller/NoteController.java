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
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class NoteController {
    @Autowired
    NoteRepository noteRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    TOPORepository topoRepository;

    Note note;
    Member member;
    TOPO topo;

    @PostMapping(value = "addComment")
    public String addComment(HttpServletRequest request, HttpServletResponse response, ModelMap model, Note note) {

        String login = request.getParameter("login");
        String topoId = request.getParameter("topoId");

        Long id2 = Long.parseLong(topoId);


        member = memberRepository.findMemberByLoginEquals(login);
        topo = topoRepository.findTOPOById(id2);

        String comment = request.getParameter("comments");
        note.setText(comment);
        note.setMember(member);
        note.setPlace(null);
        note.setTopo(topo);

        noteRepository.save(note);

        return "index";
    }

@GetMapping(value = "editCommentary")
    public String editCommentary(@RequestParam(value = "id") Long id,
                                 @RequestParam(value="memberId") String memberId,ModelMap model) {
    note = noteRepository.findNoteById(id);
    member=memberRepository.findMemberByLoginEquals(memberId);

        model.addAttribute("member",member);
        model.addAttribute("note", note);

        return "editCommentary";
    }

    @PostMapping(value = "newEdit")
    public String newEdit(ModelMap model,HttpServletRequest request) {
       String noteId=request.getParameter("noteId");
       String newText = request.getParameter("newComment");
       String editor=request.getParameter("editor");

       Long noteId2 = Long.parseLong(noteId);
       Long editor2 = Long.parseLong(editor);

       member=memberRepository.findMemberById(editor2);
       note=noteRepository.findNoteById(noteId2);

       note.setText(newText+" edité par "+member.getLogin());

       noteRepository.save(note);

        return "index";
    }



    @PostMapping(value = "deleteCommentary")
    public String deleteCommentary(HttpServletRequest request) {

        String button = request.getParameter("button");
        Long button2 = Long.parseLong(button);

        noteRepository.deleteNoteById(button2);


        return "index";

    }
}
