package org.sid.projetnumero6.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Auth_register
 */
@Controller
public class Auth_register extends HttpServlet {
    private static final long serialVersionUID = 1L; // ? A demander
@RequestMapping (value = "/auth_register")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            //TODO Auto-generated method stub
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        String birth_date=request.getParameter("birth_date");
        String first_name=request.getParameter("first_name");
        String last_name=request.getParameter("last_name");
        String address=request.getParameter("address");
        String climbing_lvl=request.getParameter("climbing_lvl");


        if(login.isEmpty()||password.isEmpty()||birth_date.isEmpty()||first_name.isEmpty()
        || last_name.isEmpty()||address.isEmpty()||climbing_lvl.isEmpty()){
            RequestDispatcher req=request.getRequestDispatcher("jsp/register.jsp");
            req.include(request,response);
        }
        else {
            RequestDispatcher req=request.getRequestDispatcher("userco.jsp");
            req.forward(request,response);
        }
    }

}
