package org.sid.projetnumero6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {


    @RequestMapping(value = {"/logn"}, method = RequestMethod.GET)
    public String logIn(Model model) { return "loggedin";}


}
