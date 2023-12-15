package com.expositores.servlet;

import com.expositores.logica.Alumno;
import com.expositores.logica.GestorDeAlumnos;
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
        // obetner el nombre del alumno del formulario
        String nombre = request.getParameter("nombre");

        // obtener la instancia de GestorDeAlumnos
        GestorDeAlumnos gestor = (GestorDeAlumnos) getServletContext().getAttribute("gestor");

        // verificar si el gestor no es nulo
        if (gestor != null) {
            // agrego un alumno a la lista
            gestor.agregarAlumno(new Alumno(nombre));

            gestor.guardarAlumnos();

            // Redirigir a la pagian de lista de alumnos
            response.sendRedirect("listaAlumnos.jsp");
        } else {
            // enviar a una pagina de error
            response.sendRedirect("error.jsp");
        }
    }
}
