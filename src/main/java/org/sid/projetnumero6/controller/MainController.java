package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.entities.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController  {




    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @GetMapping("403")
    public String notAutorized(){

        return "403";
    }






}
