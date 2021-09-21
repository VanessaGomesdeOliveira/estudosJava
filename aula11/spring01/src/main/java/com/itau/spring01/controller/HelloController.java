package com.itau.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // qual o nome do recurso http://localhost:8080/hello
public class HelloController {
    
    @GetMapping("/sample") // para este recurso, qual a açao
    public String getHello() {
        return "Olá mundo!";
    }
}
