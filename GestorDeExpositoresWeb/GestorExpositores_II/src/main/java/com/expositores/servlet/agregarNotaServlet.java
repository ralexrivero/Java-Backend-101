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

@WebServlet(name="AgregarNotaServlet", urlPatterns = {"/AgregarNotaServlet"})
public class agregarNotaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double nota = Double.parseDouble(request.getParameter("nota"));
        ServletContext context = getServletContext();
        GestorDeAlumnos gestor = (GestorDeAlumnos) context.getAttribute("gestor");
        Alumno ultimoExpositor = (Alumno) context.getAttribute("ultimoExpositor");

        if (gestor != null && ultimoExpositor != null) {
            ultimoExpositor.agregarNota(nota);
            gestor.guardarAlumnos();
            response.sendRedirect("listarAlumnos.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
