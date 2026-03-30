package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Instructor;
import com.rollerspeed.rollerspeed.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructores")
    public String listarInstructores(Model model) {
        model.addAttribute("listaInstructores", instructorService.listarInstructores());
        return "instructores/listar";
    }

    @GetMapping("/registro/instructor")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("instructor", new Instructor());
        return "registro/instructor";
    }

    @PostMapping("/registro/instructor")
    public String guardarInstructor(Instructor instructor) {
        instructorService.guardarInstructor(instructor);
        return "redirect:/instructores";
    }
}

//Qué hace este controller: /instructores → muestra el listado
// /registro/instructor con GET → abre el formulario
// /registro/instructor con POST → guarda en la BD y redirige