package com.rollerspeed.rollerspeed.repository;

import com.rollerspeed.rollerspeed.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}

//Qué hace esta interfaz: conecta la entidad Estudiante con la base de datos
//hereda métodos ya listos de JPA, como:findAll(),save(), findById(),deleteById()

//No necesitas escribir esos métodos manualmente porque JpaRepository ya los trae.
