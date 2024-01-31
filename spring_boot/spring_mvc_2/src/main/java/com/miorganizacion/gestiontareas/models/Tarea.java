package com.miorganizacion.gestiontareas.models;

import jakarta.persistence.*;
import java.time.LocalDate;

// transformamos Tarea en una entidad JPA

@Entity // entidad JPA
@Table(name = "tareas") // cual es la tabla relacionada en la base de datos
public class Tarea {
    @Id // Indica el campo que actua como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private LocalDate fecha;

    // constructores
    // constructor por defecto que no tiene argumentos, en especial para spring y para la persistencia de datos
    public Tarea() {
    }

    public Tarea(Long id, String descripcion, LocalDate fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
