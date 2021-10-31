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

    public ClienteEndereco findById(Long id) {
        Optional<ClienteEndereco> obj = clienteEnderecoRepository.findById(id);
        return obj.get();
    }

    public ClienteEndereco insertEndereco(ClienteEndereco obj) {
        return clienteEnderecoRepository.save(obj);
    }

    public void deletEndereco(ClienteEndereco obj) {
        clienteEnderecoRepository.deleteById(obj.getId());
    }

    public ClienteEndereco editEndereco(ClienteEndereco obj) {
        return clienteEnderecoRepository.save(obj);
    }
}
