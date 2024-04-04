package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.RolOperationPort;
import com.coffee.lovers.usuarios.domain.model.RolOperation;
import com.coffee.lovers.usuarios.domain.service.RolOperationService;

public class RolOperationUseCase implements RolOperationPort {
    private final RolOperationService service;

    public RolOperationUseCase(RolOperationService service) {
        this.service = service;
    }

    @Override
    public RolOperation save(RolOperation rolOperation) {
        return null;
    }

    @Override
    public RolOperation update(RolOperation rolOperation) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public RolOperation get(String key) {
        return null;
    }
}
