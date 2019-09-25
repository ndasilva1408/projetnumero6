package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController  {


    private static List<User> users= new ArrayList<User>();

    static {
        users.add(new User(null,null,"login","password","birthdate","fname","lname","addrss",123423,"Hard"));
        users.add(new User(null,null,"login2","password2","birthdate2","fname2","lname2","addrss2",128723,"Hard2"));
    }


    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String index(Model model){
        String message = "Escalade ";
        model.addAttribute("message", message);
        return "index";
    }

    @RequestMapping(value={"/userList"},method = RequestMethod.GET)
        public String viewUserList(Model model){
        model.addAttribute("user",users);
        return "userList";
    }




}
