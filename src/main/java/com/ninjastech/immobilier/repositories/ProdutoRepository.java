/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ninjastech.immobilier.entities.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author vitor.sas
 */

//CRIAÇÃO DO REPOSITÓRIO JPA
@Repository
@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    @Query("FROM Produto WHERE nome like ?1")
    List<Produto> findByNome(String nome);
     
}
