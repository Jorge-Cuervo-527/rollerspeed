package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {


    @GetMapping("/registro/clases")
    public String registroClases() {
        return "registro/clases";
    }

    @GetMapping("/horarios/estudiantes")
    public String horariosEstudiantes() {
        return "horarios/estudiantes";
    }

    @GetMapping("/horarios/instructor")
    public String horariosInstructor() {
        return "horarios/instructor";
    }
}
