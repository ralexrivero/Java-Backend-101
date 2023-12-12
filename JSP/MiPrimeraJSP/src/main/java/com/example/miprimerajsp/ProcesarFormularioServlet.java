package com.example.miprimerajsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ProcesarFormularioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");

        // validaciones basicas
        boolean esValido = nombre != null && !nombre.isEmpty() && edad != null && !edad.isEmpty();

        if (esValido) {
            request.setAttribute("nombre", nombre);
            request.setAttribute("edad", edad);
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}
