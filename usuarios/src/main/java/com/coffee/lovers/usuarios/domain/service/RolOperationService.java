package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.RolOperation;
import com.coffee.lovers.usuarios.domain.repository.RolOperationRepository;

public class RolOperationService extends AbstractGenericServiceImpl<RolOperation> {
    private final RolOperationRepository repository;

    public RolOperationService(RolOperationRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<RolOperation> getRepository() {
        return this.repository;
    }
}
