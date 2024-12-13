package com.programacion.programacion2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacion.programacion2.models.Usuario;
import com.programacion.programacion2.repository.UsuarioRepository;


@RestController
@RequestMapping("/api")
public class Usuariocontroller {

    @Autowired
    public UsuarioRepository usuarioRepository;

    @GetMapping("hola")
    public String getMethodName() {
        return "hola";
    }
    
    
    @GetMapping("usuarios")
    public List<Usuario> getusers(){
        return usuarioRepository.findAll();
    }
}
