package com.example.miprimerajsp;

import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ProcesarFormularioServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String contrasena = request.getParameter("contrasena");
        String confirmarContrasena = request.getParameter("confirmarContrasena");

        List<String> errores = new ArrayList<>();
        if (nombre == null || nombre.trim().isEmpty()) {
            errores.add("El nombre es un campo obligatorio.");
        }

        // validar constrasenas
        if (contrasena == null || contrasena.isEmpty()) {
            errores.add("La contraseña es obligatoria.");
        } else if (!contrasena.equals(confirmarContrasena)) {
            errores.add("Las contraseñas no coinciden.");
        }

        if (edad == null || edad.trim().isEmpty()) {
            errores.add("La edad es obligatorial");
        } else {
            try {
                int edadInt = Integer.parseInt(edad);
                if (edadInt < 0 || edadInt > 150) {
                    errores.add("La edad deber estar en el rango de 0 a 150.");
                }
            } catch (NumberFormatException e) {
                errores.add("La edad debe ser un numero valido.");
            }
        }

        if (email == null || email.trim().isEmpty()) {
            errores.add("El correo electronico es obligatorio");
        } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            errores.add("El formato del correo electronico no es valido.");
        }

        if (telefono == null || telefono.trim().isEmpty()) {
            errores.add("El numero de telefono es obligatorio.");
        } else if (!telefono.matches("^[0-9]{9}$")) {
            errores.add("El numero de telefono debe tener 9 digitos");
        }

        if (direccion == null || direccion.trim().isEmpty()) {
            errores.add("La direccion es un campo obligatorio.");
        }

        // Procesar la informacion

        if (errores.isEmpty()) {
            request.setAttribute("nombre", nombre);
            request.setAttribute("edad", edad);
            request.setAttribute("email", email);
            request.setAttribute("telefono", telefono);
            request.setAttribute("direccion", direccion);
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);

        } else {
            request.setAttribute("errores", errores);
            getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);

        }

    }
}
