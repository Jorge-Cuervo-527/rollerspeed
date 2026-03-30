package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Instructor;
import com.rollerspeed.rollerspeed.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    // Listar instructores
    public List<Instructor> listarInstructores() {
        return instructorRepository.findAll();
    }

    // Guardar instructor
    public Instructor guardarInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
}
