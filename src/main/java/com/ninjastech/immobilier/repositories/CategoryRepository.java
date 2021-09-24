/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninjastech.immobilier.entities.Categoria;

/**
 *
 * @author brunomartinz
 */

//CRIAÇÃO DO REPOSITÓRIO JPA
public interface CategoryRepository extends JpaRepository<Categoria, Long>{
     
}
