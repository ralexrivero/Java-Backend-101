package com.miorganizacion.gestiontareas.controllers;

import com.miorganizacion.gestiontareas.models.Tarea;
import com.miorganizacion.gestiontareas.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // anotacion de Spring que indica que este es un controlador
@RequestMapping("/tareas") // ruta base para los metodos del controlador
public class TareaController {
    @Autowired
    private TareaRepository tareaRepository;

    @GetMapping // Aca se responde a las solicitudes Get
    public String listarTareas(Model model) {
        List<Tarea> tareas = tareaRepository.findAll();
        model.addAttribute("tareas", tareas); // la lista de tareas va a estar disponible en la vista que se va a renderizar (tareas.html)
        return "tareas"; // Nombre que corresponde al archivo de la plantilla
    }

    // crear
    @GetMapping("/crear")
    public String mostrarFormularioDeCreacion(Model model) {
        model.addAttribute("tarea", new Tarea());
        return "crear-tarea";
    }

    @PostMapping
    public String crearTarea(@ModelAttribute Tarea tarea) {
        tareaRepository.save(tarea);
        return "redirect:/tareas";
    }
}
