package org.sid.projetnumero6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPageController {
    //  Authentification

    @RequestMapping(value = {"/loginPage"}, method = RequestMethod.GET)
    public String loginPage(Model model) { return "loginPage";}
}
