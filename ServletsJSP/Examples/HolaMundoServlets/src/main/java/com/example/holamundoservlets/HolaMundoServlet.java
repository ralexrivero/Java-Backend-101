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

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Información del Usuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Detalles del Usuario</h1>");
            out.println("<p>Nombre: " + nombre + "</p>");
            out.println("<p>Edad: " + edad + "</p>");
            out.println("<p>Correo Electrónico: " + email + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}