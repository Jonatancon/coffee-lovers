package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.repository.UserRepository;

import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public Optional<User> save(User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> update(User user) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<User> get(String key) {
        return Optional.empty();
    }
}
