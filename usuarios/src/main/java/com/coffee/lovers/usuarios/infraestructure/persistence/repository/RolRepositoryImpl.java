package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Rol;
import com.coffee.lovers.usuarios.domain.repository.RolRepository;

import java.util.Optional;

public class RolRepositoryImpl implements RolRepository {

    @Override
    public Optional<Rol> save(Rol rol) {
        return Optional.empty();
    }

    @Override
    public Optional<Rol> update(Rol rol) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<Rol> get(String key) {
        return Optional.empty();
    }
}
