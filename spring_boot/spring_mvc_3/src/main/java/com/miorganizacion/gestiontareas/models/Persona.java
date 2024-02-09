package com.miorganizacion.gestiontareas.models;

import jakarta.persistence.*;

import java.util.List;

@Entity // marca la clase como una entidad JPA
@Table(name="personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generar un id de forma automatica
    private Long id;
    private String nombre;
    private String apellidos;

    // Acceso bidirecciona para navegar desde la entidad Persona a sus Tareas y viceversa
    @OneToMany(mappedBy = "personaAsignada", fetch = FetchType.LAZY) // Lazy solo es bajo demanda
    // @OneToMany representa una relacion de una muchos. Una persona puede tener muchas tareas.
    private List<Tarea> tareasAsignadas;

    public Persona() {

    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
