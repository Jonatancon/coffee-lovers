package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.RolOperation;
import com.coffee.lovers.usuarios.domain.repository.RolOperationRepository;

import java.util.Optional;

public class RolOperationRepositoryImpl implements RolOperationRepository {

    @Override
    public Optional<RolOperation> save(RolOperation rolOperation) {
        return Optional.empty();
    }

    @Override
    public Optional<RolOperation> update(RolOperation rolOperation) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<RolOperation> get(String key) {
        return Optional.empty();
    }
}
