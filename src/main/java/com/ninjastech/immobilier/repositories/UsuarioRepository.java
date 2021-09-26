package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findBynomeUsuario(String nomeUsuario);
}
