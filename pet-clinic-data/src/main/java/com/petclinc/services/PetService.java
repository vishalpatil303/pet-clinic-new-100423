package com.petclinc.services;

import com.petclinc.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();

}
