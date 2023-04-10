package com.petclinc.services;

import com.petclinc.model.Owner;



public interface OwnerService  extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
