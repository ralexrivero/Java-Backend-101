package com.example.servlet000;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class MiPrimerServlet extends HttpServlet {
    // solicitudes HTTTP: Get, Post, Put, Delete
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter(); // PrintWriter se usa para enviar informacion al cliente
        out.println("<html><body>");
        out.println("<h1>Hola! Este es mi priver Servlet</h1>");
        out.println("<h2>Hola! Este es mi priver Servlet</h2>");
        out.println("</body></html>");
    }
}
