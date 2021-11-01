package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.ClienteEndereco;
import com.ninjastech.immobilier.repositories.ClienteEnderecoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wesley
 */
@Service
public class ClienteEnderecoService {

    @Autowired
    private ClienteEnderecoRepository clienteEnderecoRepository;

    public List<ClienteEndereco> findAll() {
        return clienteEnderecoRepository.findAll();
    }

    public List<ClienteEndereco> findByClienteEndereco(String id) {
        return clienteEnderecoRepository.findByIdcliente(id);
       
    }

    public ClienteEndereco insertEndereco(ClienteEndereco obj) {
        obj.setPrincipal(false);
        return clienteEnderecoRepository.save(obj);
    }
    
    public ClienteEndereco editCliente(ClienteEndereco obj){
        return clienteEnderecoRepository.save(obj);
    }
}