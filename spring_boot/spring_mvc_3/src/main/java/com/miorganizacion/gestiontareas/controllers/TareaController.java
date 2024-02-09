package com.miorganizacion.gestiontareas.controllers;

import com.miorganizacion.gestiontareas.models.Tarea;
import com.miorganizacion.gestiontareas.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    // Metodo para mostrar el formulario de edicion de tarea
    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model model) {
        Tarea tarea = tareaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Tarea no valida: " + id));
        model.addAttribute("tarea", tarea);
        return "editar-tarea";
    }

    // Metodo para procesar el formulario de edicion de tarea
    @PostMapping("editar/{id}") // el {id} es un placeholder
    public String actualizarTarea(@PathVariable Long id, @ModelAttribute Tarea tarea, Model model) {
        // Actualizo la tarea
        tarea.setId(id);
        tareaRepository.save(tarea);
        return "redirect:/tareas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarTarea(@PathVariable("id") Long id) {
        tareaRepository.deleteById(id);
        return "redirect:/tareas;";
    }
}
