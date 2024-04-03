package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.Operation;
import com.coffee.lovers.usuarios.domain.repository.OperationRepository;

public class OperationService extends AbstractGenericServiceImpl<Operation> {
    private final OperationRepository repository;

    public OperationService(OperationRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Operation> getRepository() {
        return this.repository;
    }
}
