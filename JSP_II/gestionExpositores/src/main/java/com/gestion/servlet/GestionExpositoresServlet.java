package com.gestion.servlet;

import com.gestion.logica.Alumno;
import com.gestion.logica.GestorDeAlumnos;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.Scanner;

@WebServlet(name = "GestionExpositoresServlet", urlPatterns = {"/gestion"})
public class GestionExpositoresServlet extends HttpServlet {
    private GestorDeAlumnos gestor = new GestorDeAlumnos();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Manejar las solicitudes GET (mostrar información)
        request.setAttribute("alumnos", gestor.getAlumnos());
        RequestDispatcher dispatcher = request.getRequestDispatcher("gestion.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Manejar las solicitudes POST (agregar, seleccionar expositor, etc.)
        String accion = request.getParameter("accion");
        switch (accion) {
            case "agregar":
                // Lógica para agregar alumno
                String nombreAlumno = request.getParameter("nombreAlumno");
                if (nombreAlumno != null && !nombreAlumno.trim().isEmpty()) {
                    gestor.agregarAlumno(new Alumno(nombreAlumno));
                    gestor.guardarAlumnos();
                }
                break;
            case "seleccionar":
                // Lógica para seleccionar expositor
                Alumno ultimoExpositor = gestor.seleccionarExpositor();
                request.setAttribute("ultimoExpositor", ultimoExpositor);
                break;
            default:
                break;
        }

        doGet(request, response);
    }
}
