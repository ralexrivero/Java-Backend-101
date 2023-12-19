package com.expositores.servlet;

import com.expositores.logica.Alumno;
import com.expositores.logica.GestorDeAlumnos;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SeleccionarExpositorServlet", urlPatterns = {"/SeleccionarExpositorServlet"})
public class SeleccionarExpositorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        GestorDeAlumnos gestor = (GestorDeAlumnos) context.getAttribute("gestor");

        if (gestor != null) {
            Alumno expositorSeleccionado = gestor.seleccionarExpositor();
            request.setAttribute("expositor", expositorSeleccionado);
            RequestDispatcher dispatcher = context.getRequestDispatcher("/mostrarExpositor.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
