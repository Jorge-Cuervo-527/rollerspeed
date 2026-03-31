package com.rollerspeed.rollerspeed.repository;

import com.rollerspeed.rollerspeed.model.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Long> {
}


//JpaRepository<Clase, Long> le dice a Spring:
//maneje automáticamente CRUD para Clase
//guardar clases, listar clases, buscar por id y eliminar sin escribir lógica adicional