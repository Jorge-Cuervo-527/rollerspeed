package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.Clase;
import com.rollerspeed.rollerspeed.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClaseController {

    @Autowired
    private ClaseService claseService;

    @GetMapping("/clases")
    public String listarClases(Model model) {
        model.addAttribute("listaClases", claseService.listarClases());
        return "clases/listar";
    }

    @GetMapping("/registro/clases")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("clase", new Clase());
        return "registro/clases";
    }

    @PostMapping("/registro/clases")
    public String guardarClase(Clase clase) {
        claseService.guardarClase(clase);
        return "redirect:/clases";
    }
}

//este controller se encarga de:
//clases → lista las clases guardadas
//registro/clases con GET → abre el formulario
//registro/clases con POST → guarda y redirige al listado