/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninjastech.immobilier.repositories;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ninjastech.immobilier.entities.Imagens;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Arnaldo
 */
@Repository
@Transactional
public interface ImagensRepository extends JpaRepository <Imagens, Long> {
    @Query("FROM Imagens WHERE idProd = ?1")
    List<Imagens> findByIdProd(long idProd);

}

