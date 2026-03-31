package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @Autowired
    private ClaseService claseService;

    @GetMapping("/horarios/estudiantes")
    public String horariosEstudiantes(Model model) {
        model.addAttribute("listaClases", claseService.listarClases());
        return "horarios/estudiantes";
    }

    @GetMapping("/horarios/instructor")
    public String horariosInstructor(Model model) {
        model.addAttribute("listaClases", claseService.listarClases());
        return "horarios/instructor";
    }
}