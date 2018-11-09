/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaclasses.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IT
 */
@WebServlet(name = "mpesa_express", urlPatterns = {"/mpesa_express"})
public class mpesa_express extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("<title>Servlet mpesa_express</title>");            
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("<h1>Servlet mpesa_express at " + request.getContextPath() + "</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
        System.out.println("There we go");
//        try (PrintWriter out = response.getWriter()) {
//          
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet mpesa_express</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet mpesa_express at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }
}
