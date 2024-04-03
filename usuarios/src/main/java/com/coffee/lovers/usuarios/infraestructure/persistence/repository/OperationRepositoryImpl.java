package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Operation;
import com.coffee.lovers.usuarios.domain.repository.OperationRepository;

import java.util.Optional;

public class OperationRepositoryImpl implements OperationRepository {
    @Override
    public Optional<Operation> save(Operation operation) {
        return Optional.empty();
    }

    @Override
    public Optional<Operation> update(Operation operation) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<Operation> get(String key) {
        return Optional.empty();
    }
}
