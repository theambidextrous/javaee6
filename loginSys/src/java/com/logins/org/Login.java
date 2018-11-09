/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logins.org;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author IT
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Uname = request.getParameter("uname");
        String Pass = request.getParameter("pass");
        
        if(Uname.equals("Idd") && Pass.equals("Idd")){
            HttpSession session = request.getSession();
            session.setAttribute("Username", Uname);
            response.sendRedirect("welcome.jsp");
         }
        else{
            response.sendRedirect("index.jsp");
        }
}
    
}