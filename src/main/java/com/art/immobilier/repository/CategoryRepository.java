/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.art.immobilier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.art.immobilier.model.Categoria;

/**
 *
 * @author vitor.sas
 */

//CRIAÇÃO DO REPOSITÓRIO JPA
public interface CategoryRepository extends JpaRepository<Categoria, Long>{
     
}
