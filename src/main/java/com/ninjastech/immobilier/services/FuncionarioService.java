package com.ninjastech.immobilier.services;
import com.ninjastech.immobilier.entities.Funcionario;
import com.ninjastech.immobilier.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    //Listar todos funcionarios
    public List<Funcionario> listAll(){
        return funcionarioRepository.findAll();
    }

    //Listar por email
    public Funcionario findByemail(String email){
        return funcionarioRepository.findByemail(email);
    }
}
