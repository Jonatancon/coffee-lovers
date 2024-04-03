package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.repository.UserRepository;

public class UserService extends AbstractGenericServiceImpl<User> {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<User> getRepository() {
        return this.repository;
    }
}
