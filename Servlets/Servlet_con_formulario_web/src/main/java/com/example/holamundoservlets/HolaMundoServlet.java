package com.example.holamundoservlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HolaMundo")
public class HolaMundoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola Mundo Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola Mundo desde Servlets</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String email = request.getParameter("email");

        response.setContentType("text/html;chatset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<title>Saludo personalizado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Información del usuario</h1>");
            out.println("<h2>Nombre:" + nombre + "</h2>");
            out.println("<p>Edad: " + edad + " años</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}