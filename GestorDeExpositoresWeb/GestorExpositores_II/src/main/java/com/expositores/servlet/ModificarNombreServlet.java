package com.expositores.servlet;

import com.expositores.logica.GestorDeAlumnos;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ModificarNombreServlet", urlPatterns = {"/ModificarNombreServlet"})
public class ModificarNombreServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreAntiguo = request.getParameter("nombreAntiguo");
        String nuevoNombre = request.getParameter("nuevoNombre");
        ServletContext context = getServletContext();
        GestorDeAlumnos gestor = (GestorDeAlumnos) context.getAttribute("gestor");


        if (gestor != null) {
            gestor.modificarNombreAlumno(nombreAntiguo, nuevoNombre);
            gestor.guardarAlumnos();
            response.sendRedirect("listarAlumnos.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
