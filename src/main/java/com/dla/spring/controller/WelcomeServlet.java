
package com.dla.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        /*
         * PrintWriter out=response.getWriter(); out.println("<!Doctype html>");
         * out.println("<html>"); out.println("<head>");
         * out.println("<title>First Servlet</title>"); out.println("</head>");
         * out.println("<body>"); out.println("<h1>"); out.println("Welcome home " +
         * request.getParameter("name") + "!</h1></body>"); out.println("</html>");
         */
        //business logic
        request.getRequestDispatcher("WEB-INF/views/Welcome.jsp").forward(request, response);
        
        //response.getWriter().append("My first servlet");
        
        
        }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        doGet(request, response);
    }

}
