package com.ninjastech.immobilier.resources;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@ComponentScan(basePackages = { "com.*" })
public class UsuarioResource {

}
