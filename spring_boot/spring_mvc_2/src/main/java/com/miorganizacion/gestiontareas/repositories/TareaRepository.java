package com.miorganizacion.gestiontareas.repositories;

import com.miorganizacion.gestiontareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    // Puedo agregar metodos personalizados si lo necesito
    // obtengo operaciones de escritura, lectura, actualizacion, borrado (CRUD)
}
