package com.expositores.servlet;

import com.expositores.logica.Alumno;
import com.expositores.logica.GestorDeAlumnos;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AgregarAlumnoServlet", urlPatterns = {"/AgregarAlumnoServlet"})
public class AgregarAlumnoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        ServletContext context = getServletContext();
        GestorDeAlumnos gestor = (GestorDeAlumnos) context.getAttribute("gestor");

        if (gestor != null) {
            gestor.agregarAlumno(new Alumno(nombre));
            gestor.guardarAlumnos();
            response.sendRedirect("listarAlumnos.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
