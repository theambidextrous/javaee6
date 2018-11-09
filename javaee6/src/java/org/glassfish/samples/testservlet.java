/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.glassfish.samples.model.Friend;

/**
 *
 * @author IT
 */
@WebServlet(name = "testservlet", urlPatterns = {"/testservlet"})
public class testservlet extends HttpServlet {
    
    @PersistenceUnit
    EntityManagerFactory emf;
    @EJB FriendEJB ejb;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet testservlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet testservlet at " + request.getContextPath() + "</h1>");

            //count sessions/visits
            int count;
            if (request.getSession().getAttribute("count") == null) {
                count = 0;
            } else {
                count = (Integer) request.getSession().getAttribute("count");
            }
            request.getSession().setAttribute("count", ++count);
            out.println("Accessed: " + request.getSession().getAttribute("count"));
            //get friend  using entity class directly
            Friend f = (Friend) emf.createEntityManager().createNamedQuery("Friend.findAll").getResultList().get(4);
            out.println("<br>Friend Name is: " + f.getName() + " and age is: " + f.getAge());
            
             //get friend using ejb method
            Friend f2 = (Friend) ejb.getList().get(3);
            out.println("<br>Friend Name is: " + f2.getName() + " and age is: " + f2.getAge());
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
