package com.miorganizacion.gestiontareas.controllers;

import com.miorganizacion.gestiontareas.models.Persona;
import com.miorganizacion.gestiontareas.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
