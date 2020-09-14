package com.example.enrolleeservice.core;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, I> {

    T save(T t);

    List<T> saveAll(List<T> t);

    Optional<T> findOne(I id);

    List<T> findAll();

    void deleteById(I id);
}
