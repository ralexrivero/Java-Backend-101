package com.miorganizacion.gestionreuniones;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Bienvenidos a la app de gestión de reuniones";
    }
}
