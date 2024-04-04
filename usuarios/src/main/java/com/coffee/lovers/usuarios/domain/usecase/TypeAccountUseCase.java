package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.TypeAccountPort;
import com.coffee.lovers.usuarios.domain.model.TypeAccount;
import com.coffee.lovers.usuarios.domain.service.TypeAccountService;

public class TypeAccountUseCase implements TypeAccountPort {
    private final TypeAccountService service;

    public TypeAccountUseCase(TypeAccountService service) {
        this.service = service;
    }

    @Override
    public TypeAccount save(TypeAccount typeAccount) {
        return null;
    }

    @Override
    public TypeAccount update(TypeAccount typeAccount) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public TypeAccount get(String key) {
        return null;
    }
}
