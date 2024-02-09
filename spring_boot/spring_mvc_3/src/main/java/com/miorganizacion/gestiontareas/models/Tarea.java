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

    // Relacion con Persona
    @ManyToOne // relacion muchos a uno entre Tarea y Persona. Muchas instancias de Tarea pueden asociarse a una unica instancia de Persona
    @JoinColumn(name = "persona_id") // La columna que se usa para la clave foranea es persona_id
    private  Persona asignadoA;

    // Campo para el estado de la tarea
    @Enumerated(EnumType.STRING)  // Guarda el enum como texto en la base de datos
    private EstadoTarea estado;

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

    public Persona getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(Persona asignadoA) {
        this.asignadoA = asignadoA;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }
}
