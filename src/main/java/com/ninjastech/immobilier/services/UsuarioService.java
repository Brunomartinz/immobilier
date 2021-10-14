package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.Usuario;
import com.ninjastech.immobilier.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //listar todos
    public List<Usuario> listAll(){
        return  usuarioRepository.findAll();
    }

    //listar um determinado aluno
    public Usuario findUser(String email){
        return usuarioRepository.findByemail(email);
    }

}
