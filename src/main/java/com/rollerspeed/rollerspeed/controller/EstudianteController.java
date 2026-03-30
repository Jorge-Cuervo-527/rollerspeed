package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Estudiante;
import com.rollerspeed.rollerspeed.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public String listarEstudiantes(Model model) {
        model.addAttribute("listaEstudiantes", estudianteService.listarEstudiantes());
        return "estudiantes/listar";
    }

    @GetMapping("/registro/estudiante")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("estudiante", new Estudiante());
        return "estudiantes/registro";
    }

    @PostMapping("/registro/estudiante")
    public String guardarEstudiante(Estudiante estudiante) {
    estudianteService.guardarEstudiante(estudiante);
    return "redirect:/estudiantes";
}
}



//este controller Tiene dos rutas:
// /estudiantes: --consulta todos los estudiantes desde el service y los manda a la vista con el nombre listaEstudiantes
// /registro/estudiante: --prepara un objeto vacío Estudiante y lo envía a una vista de formulario

//Estudiantes → Listar estudiantes
//Registro → Inscripción de Estudiantes
