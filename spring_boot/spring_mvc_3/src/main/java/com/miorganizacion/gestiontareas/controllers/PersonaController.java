package com.miorganizacion.gestiontareas.controllers;

import com.miorganizacion.gestiontareas.models.Persona;
import com.miorganizacion.gestiontareas.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping
    public String ListarPersonas(Model model) {
        model.addAttribute("personas", personaRepository.findAll());
        return "lista-personas";
    }
    @GetMapping("/crear")
    public String mostrarFormularioDeCreacion(Model model) {
        model.addAttribute("persona", new Persona());
        return "crear-persona";
    }
    @PostMapping
    public String crearPersona(Persona persona) {
        personaRepository.save(persona);
        return "redirect:/personas";
    }

    // metodo para mostrar el formulario
    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model model) {
        Persona persona = personaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de persona no valido: " + id));
        model.addAttribute("persona", persona);
        return "editar-persona";
    }

    // Metodo para procesar el formulario
    @PostMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable Long id, @ModelAttribute Persona persona, Model model) {
        persona.setId(id);
        personaRepository.save(persona);
        return "redirect:/personas";
    }

    // Eliminar persona
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable("id") Long id) {
        personaRepository.deleteById(id);
        return "redirect:/personas";
    }
}
