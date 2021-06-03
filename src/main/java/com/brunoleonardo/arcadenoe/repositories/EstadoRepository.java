package com.brunoleonardo.arcadenoe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunoleonardo.arcadenoe.entities.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
