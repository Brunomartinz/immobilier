package com.ninjastech.immobilier.repositories;

import com.ninjastech.immobilier.entities.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
    //procurar pelo email do Funcionario
    Funcionario findByemail(String email);
}
