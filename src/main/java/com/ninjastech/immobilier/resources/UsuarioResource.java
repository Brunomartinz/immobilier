package com.ninjastech.immobilier.resources;


import com.ninjastech.immobilier.entities.Usuario;
import com.ninjastech.immobilier.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@ComponentScan(basePackages = { "com.*" })
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping

    public Usuario buscarUsuario(String email){
        return usuarioService.findUser(email);
    }




}
