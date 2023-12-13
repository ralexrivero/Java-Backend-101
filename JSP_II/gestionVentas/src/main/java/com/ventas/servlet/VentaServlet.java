package com.ventas.servlet;

import com.ventas.logica.Venta;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "VentaServlet", urlPatterns = {"/VentaServlet"})
public class VentaServlet extends HttpServlet {
    private Venta venta = new Venta();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ventaCantidad = Integer.parseInt(request.getParameter("venta"));
        venta.setTotal(ventaCantidad);
        venta.setMaxima(ventaCantidad);
        venta.setCantidad();

        request.setAttribute("total", venta.getTotal());
        request.setAttribute("maxima", venta.getMaxima());
        request.setAttribute("cantidad", venta.getCantidad());

        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
