package com.petclinc.services;

import java.util.Set;

public interface CrudService<T,Long> {
    Set<T> findAll();

    T findById(Long id);

    T Save (T t);

    void delete(T t);

    void deleteById(Long id);

}
