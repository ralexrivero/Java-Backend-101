package com.banco.servlet;

import com.banco.logica.CuentaBanco;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CuentaServlet", urlPatterns = {"/CuentaServlet"})
public class CuentaServlet extends HttpServlet {

    private CuentaBanco cuenta = new CuentaBanco("admin", "123", 500.0);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        double cantidad = Double.parseDouble(request.getParameter("cantidad"));
        String accion = request.getParameter("accion");

        if ("Depositar".equals(accion)) {
            cuenta.depositar(usuario, contrasenia, cantidad);
        } else if ("Retirar".equals(accion)) {
            cuenta.retirar(usuario, contrasenia, cantidad);
        }

        request.setAttribute("saldo", cuenta.getSaldo());
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
