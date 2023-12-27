package com.miaplicacion.controller;


// Un Servlet actua como el controlador, gestiona la logica de negocio y controla el flujo de la aplicacion.
// Recibe y responde a solicitudes HTTP.

import com.miaplicacion.model.Usuario;
import com.miaplicacion.model.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/usuario")  // mapear su url
public class UsuarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // cuando mando un formulario a '/usuario' este codigo se ejecuta
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");

        Usuario usuario = new Usuario(nombre, email);
        boolean success = UsuarioDAO.insertar(usuario);

        if (success) {
            response.sendRedirect("exito.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> listaUsuarios = UsuarioDAO.obtenerTodos();

        request.setAttribute("usuarios", listaUsuarios);
        getServletContext().getRequestDispatcher("/verUsuarios.jsp").forward(request, response);
    }

}
