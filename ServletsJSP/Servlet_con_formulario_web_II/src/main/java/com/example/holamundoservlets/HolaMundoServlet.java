package com.example.holamundoservlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
        // obtener los datos del formulario
        String nombre = request.getParameter("nombre");
        String edadStr = request.getParameter("edad");
        String email = request.getParameter("email");

        List<String> errores = new ArrayList<>();

        // Validacion del nombre: no vacio
        if (nombre == null || nombre.trim().isEmpty()) {
            errores.add("El nombre es un campo obligatorio");
        }

        // validar la edad
        int edad = 0;

        try {
            edad = Integer.parseInt(edadStr);
            if (edad <= 0) {
                errores.add("La edad debe ser mayor que 0");
            }
        } catch (NumberFormatException e) {
            errores.add("La edad deber un numero valido");
        }

        // validacion del email: formato
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            errores.add("El email no es valido");
        }

        // Procesar los datos a mostrar
        response.setContentType("text/html;chatset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (!errores.isEmpty()) {
                // Si hay errores agregados al arrayList 'errores' ser muestran los errores
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<title>Errores en el formulario</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Errores en el formulario</h1>");
                for (String error : errores) {
                    out.println("<p>" + error + "</p>");
                }
                out.println("</body>");
                out.println("</html>");
            } else {
                // mostrar cuando hay error
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<title>Pagina de respuesta</title>");
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
}