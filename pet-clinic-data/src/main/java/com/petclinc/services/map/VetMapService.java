package com.petclinc.services.map;

import com.petclinc.model.Vet;
import com.petclinc.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet Save(Vet vet) {
        return super.save((vet.getId()),vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
