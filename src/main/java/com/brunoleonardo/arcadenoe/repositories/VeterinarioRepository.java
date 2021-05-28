package com.brunoleonardo.arcadenoe.repositories;

import com.brunoleonardo.arcadenoe.entities.Veterinario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
    
}
