package com.ninjastech.immobilier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.entities.Usuario;
import com.ninjastech.immobilier.repositories.UsuarioRepository;

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
    
    //Busca o usuario por Email
    public List<Usuario> findEmail(String palavra) {
        String email = palavra+"%";
        System.out.println(email);
	return usuarioRepository.findByEmail(email);
}

    // Insere no banco de dados um novo objeto do tipo Usuário
    public Usuario insertUsuario(Usuario obj) {
        return usuarioRepository.save(obj);
    }
    
    
    //Deleção de usuário por id
    public void deletUser(Usuario obj){
        usuarioRepository.deleteById(obj.getId());
        }
    //Alteração Users
    public Usuario editUsuario(Usuario obj){
        return usuarioRepository.save(obj);
}
    
}
