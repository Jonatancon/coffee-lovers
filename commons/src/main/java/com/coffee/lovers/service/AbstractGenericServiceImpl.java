package com.coffee.lovers.service;

import com.coffee.lovers.model.Constants;
import com.coffee.lovers.model.exception.Conflict;
import com.coffee.lovers.model.exception.NotFound;
import com.coffee.lovers.repository.GenericRepository;

import java.util.Objects;
import java.util.Optional;

public abstract class AbstractGenericServiceImpl <T> implements GenericService<T> {

    protected abstract GenericRepository<T> getRepository();


    @Override
    public T save(T t) {
        return getRepository()
                .save(t)
                .orElseThrow(() -> new Conflict(Constants.ERROR_CREATE_ELEMENT.getMessage()));
    }

    @Override
    public T update(T t) {
        return getRepository()
                .update(t)
                .orElseThrow(() -> new Conflict(Constants.ERROR_CREATE_ELEMENT.getMessage()));
    }

    @Override
    public void delete(String key) {
        getRepository().delete(key);
    }

    @Override
    public T get(String key) {
        return getRepository()
                .get(key)
                .orElseThrow(() -> new NotFound(Constants.NOT_FOUND_ELEMENT.getMessage() + key));
    }
}
