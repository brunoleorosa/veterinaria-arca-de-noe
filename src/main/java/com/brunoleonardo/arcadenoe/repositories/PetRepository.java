package com.brunoleonardo.arcadenoe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoleonardo.arcadenoe.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
