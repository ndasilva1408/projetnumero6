package org.sid.projetnumero6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController  {




    @GetMapping(value = {"/index"})
    public String index(){
        return "index";
    }


// -------------- ERROR MAPPING -----------

        @RequestMapping(value = "/403")
        public String handler403(){
            return "403";
        }
    }




