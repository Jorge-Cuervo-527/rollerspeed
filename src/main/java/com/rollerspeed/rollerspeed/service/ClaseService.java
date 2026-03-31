package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Clase;
import com.rollerspeed.rollerspeed.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaseService {

    @Autowired
    private ClaseRepository claseRepository;

    // Listar clases
    public List<Clase> listarClases() {
        return claseRepository.findAll();
    }

    // Guardar clase
    public Clase guardarClase(Clase clase) {
        return claseRepository.save(clase);
    }
}

//este service se conecta con el repository y nos permite:
//listar clases desde la BD y guardar clases en la BD
