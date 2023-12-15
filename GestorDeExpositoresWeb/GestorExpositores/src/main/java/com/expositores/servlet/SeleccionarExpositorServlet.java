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

@WebServlet(name = "SeleccionarExpositorServlet", urlPatterns = {"/SeleccionarExpositorServlet"})
public class SeleccionarExpositorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // obtener la instancia del gestor del gestor de alumnos
        ServletContext context = getServletContext();
        GestorDeAlumnos gestor = (GestorDeAlumnos) context.getAttribute("gestor");

        // verificar si el gestor es nulo
        if (gestor != null) {
            // Seleccionar expositor
            Alumno expositorSeleccionado = gestor.seleccionarExpositor();

            // setear el atributo del request con la info del expositor
            request.setAttribute("expositor", expositorSeleccionado);

            // redirijo la info del expositor
            context.getRequestDispatcher("/mostarExpositor.jsp").forward(request, response);
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
