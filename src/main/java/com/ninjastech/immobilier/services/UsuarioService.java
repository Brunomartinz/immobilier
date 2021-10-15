package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.Produto;
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
        return usuarioRepository.findAll();
    }

//    //listar um determinado usuário
//    public Usuario findUser(String email){
//        return usuarioRepository.findByemail(email);
//    }

    // Insere no banco de dados um novo objeto do tipo Usuário
    public Usuario insertUsuario(Usuario obj) {
        return usuarioRepository.save(obj);
    }
}
