package com.miorganizacion.gestiontareas.repositories;

import com.miorganizacion.gestiontareas.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
