package com.miorganizacion.gestiontareas.controllers;

import com.miorganizacion.gestiontareas.models.Contacto;
import com.miorganizacion.gestiontareas.repositories.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;

    @GetMapping
    public String mostrarFormularioDeContacto(@RequestParam(name = "success", required = false) Boolean success, Model model) {
        model.addAttribute("contacto", new Contacto());
        if (Boolean.TRUE.equals(success)) {
            model.addAttribute("mensajeSuccess", "El formulario se envió correctamente.");
        }
        return "contacto";
    }

    @PostMapping
    public String procesarFormularioDeContacto(Contacto contacto) {
        contactoRepository.save(contacto); // Guardar el contacto en la base de datos
        return "redirect:/contacto?success=true";
    }
}
