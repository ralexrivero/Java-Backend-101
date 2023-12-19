package com.expositores.servlet;

import com.expositores.logica.GestorDeAlumnos;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        GestorDeAlumnos gestor = new GestorDeAlumnos();
        sce.getServletContext().setAttribute("gestor", gestor);
    }

    public void contextDestroyed(ServletContextEvent sce) {
        // para cerrar los recuersos cuando sea necesario
    }
}
