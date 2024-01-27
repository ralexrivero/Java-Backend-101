package com.miorganizacion.controllers;

import com.miorganizacion.models.Tarea;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller // anotacion de Spring que indica que este es un controlador
@RequestMapping("/tareas") // ruta base para los metodos del controlador
public class TareaController {
    private static final List<Tarea> tareas = Arrays.asList(
            new Tarea(1L, "Revisar correos", LocalDate.now()),
            new Tarea(2L, "Planificar las clases proximas", LocalDate.now().plusDays(1)),
            new Tarea(3L, "Actualizar Github de Java-Backend", LocalDate.now().plusDays(2))
    ); // info estatica de prueba mientras implemento la bd

    @GetMapping // Aca se responde a las solicitudes Get
    public String listarTareas(Model model) {
        model.addAttribute("tareas", tareas); // la lista de tareas va a estar disponible en la vista que se va a renderizar (tareas.html)
        return "tareas"; // Nombre que corresponde al archivo de la plantilla
    }
}
