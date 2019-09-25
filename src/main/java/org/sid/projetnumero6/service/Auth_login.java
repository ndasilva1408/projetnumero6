package org.sid.projetnumero6.service;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Auth_login extends HttpServlet {


    public Auth_login(){
        super();
    }
    @RequestMapping(value = "/auth_login")
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                    String login=request.getParameter("login");
                    String password=request.getParameter("password");

                    if (login.isEmpty()||password.isEmpty()){
                        RequestDispatcher req=request.getRequestDispatcher("loginPage.jsp");
                            req.include(request,response);
                    }
                    else
                        {  RequestDispatcher req = request.getRequestDispatcher("loggedin.jsp");
                            req.forward(request,response);

                    }


        }
}
