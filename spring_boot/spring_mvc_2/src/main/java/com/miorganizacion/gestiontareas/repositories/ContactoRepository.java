package com.miorganizacion.gestiontareas.repositories;

import com.miorganizacion.gestiontareas.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}
