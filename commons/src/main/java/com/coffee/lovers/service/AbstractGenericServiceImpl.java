package com.coffee.lovers.service;

import com.coffee.lovers.repository.GenericRepository;

import java.util.Optional;
import java.util.stream.Stream;

public abstract class AbstractGenericServiceImpl <T> implements GenericService<T> {

    protected abstract GenericRepository<T> getRepository();


    @Override
    public Optional<T> save(T t) {
        return getRepository().save(t);
    }

    @Override
    public Optional<T> update(T t) {
        return getRepository().update(t);
    }

    @Override
    public boolean delete(String key) {
        return getRepository().delete(key);
    }

    @Override
    public Optional<T> get(String key) {
        return getRepository().get(key);
    }
}
