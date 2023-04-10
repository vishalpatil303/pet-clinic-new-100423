package com.petclinc.services;

import com.petclinc.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
