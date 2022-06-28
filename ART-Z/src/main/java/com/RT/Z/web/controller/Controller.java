package com.RT.Z.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class Controller {


    //protected $test;

    @GetMapping("/hola")
    public String saludar() {
        return "Sin Parar de Aprender a Saludar";
    }
}
