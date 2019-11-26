package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.ClimbPathRepository;
import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.ClimbPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class ClimbPathController {
    @Autowired
    TOPORepository topoRepository;
    @Autowired
    ClimbPathRepository climbPathRepository;



    @GetMapping (value = "/createClimbPath")
    public String createclimbPath(ModelMap model){

        model.put("topoList", topoRepository.findAll());

        return "createClimbPath";
    }


    @PostMapping(value = "/createClimbPath")
    public String saveclimbPath(@Valid ClimbPath climbPath, HttpServletRequest request, BindingResult bindingResult) {


        String topoName = request.getParameter("topoName");


        climbPath.setTopo(topoRepository.findTOPOByName(topoName));

        if (bindingResult.hasErrors()) {
            return "createClimbPath";

        } else {
            climbPathRepository.save(climbPath);
            return "index";
        }
    }

  @GetMapping (value = "/detailsClimbPath")
    public String getClimbPathbyId(@RequestParam(value = "id", required = false) Long id, Model model) {

        ClimbPath climbPath = climbPathRepository.findClimbPathById(id);
        model.addAttribute("climbPath", climbPath);


        return "detailsClimbPath";
    }
}
