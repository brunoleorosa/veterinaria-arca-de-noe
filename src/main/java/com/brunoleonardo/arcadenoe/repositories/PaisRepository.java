package com.brunoleonardo.arcadenoe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunoleonardo.arcadenoe.entities.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
