package com.ninjastech.immobilier.services;

import com.ninjastech.immobilier.entities.ClienteEndereco;
import com.ninjastech.immobilier.repositories.ClienteEnderecoRepository;
import java.util.List;
import java.util.Optional;
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
    
    public ClienteEndereco findById(long id) {
        Optional<ClienteEndereco> endereco = clienteEnderecoRepository.findById(id);
        return endereco.get();
    }

    public ClienteEndereco insertEndereco(ClienteEndereco obj) {
        obj.setPrincipal(false);
        return clienteEnderecoRepository.save(obj);
    }
    
    public ClienteEndereco editCliente(ClienteEndereco obj){
        return clienteEnderecoRepository.save(obj);
    }
    
    public ClienteEndereco editPrincipal(ClienteEndereco obj) {
        obj.setPrincipal(false);
        return clienteEnderecoRepository.save(obj);
    }
}