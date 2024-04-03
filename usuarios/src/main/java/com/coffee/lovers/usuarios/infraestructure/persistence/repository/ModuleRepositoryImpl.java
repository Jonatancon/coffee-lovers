package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.repository.ModuleRepository;

import java.util.Optional;

public class ModuleRepositoryImpl implements ModuleRepository {

    @Override
    public Optional<Module> save(Module module) {
        return Optional.empty();
    }

    @Override
    public Optional<Module> update(Module module) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<Module> get(String key) {
        return Optional.empty();
    }
}
