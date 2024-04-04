package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.OperationPort;
import com.coffee.lovers.usuarios.domain.model.Operation;
import com.coffee.lovers.usuarios.domain.repository.OperationRepository;
import com.coffee.lovers.usuarios.domain.service.OperationService;

import java.util.Optional;

public class OperationUseCase implements OperationPort {
    private final OperationService service;

    public OperationUseCase(OperationService service) {
        this.service = service;
    }

    @Override
    public Operation save(Operation operation) {
        return null;
    }

    @Override
    public Operation update(Operation operation) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Operation get(String key) {
        return null;
    }
}
