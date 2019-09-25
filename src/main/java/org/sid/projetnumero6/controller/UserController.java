package org.sid.projetnumero6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class UserController {
    @RequestMapping(value = {"/userco"}, method = RequestMethod.GET)
    public String userCo(Model model){
        return "userco";
    }

}


