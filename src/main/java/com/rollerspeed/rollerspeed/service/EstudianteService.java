package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Estudiante;
import com.rollerspeed.rollerspeed.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Obtener todos los estudiantes
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    // Guardar estudiante
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}


//@Service → capa de lógica del negocio --@Autowired → inyección del repository
//findAll() → trae todos los registros de la BD y el save() → guarda datos en la BD

//Ya estamos conectando: Controller → Service → Repository → Base de Datos
