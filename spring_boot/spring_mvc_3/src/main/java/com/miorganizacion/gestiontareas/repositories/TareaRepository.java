package com.miorganizacion.gestiontareas.repositories;

import com.miorganizacion.gestiontareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// interfaz que extiende JpaRepository, proporciona metodos CRUD para la entidad Tarea
// Spring Data JPA implemtna este repositorio en tiempo de ejecucion
@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    // Puedo agregar metodos personalizados si lo necesito
    // obtengo operaciones de escritura, lectura, actualizacion, borrado (CRUD)
}
