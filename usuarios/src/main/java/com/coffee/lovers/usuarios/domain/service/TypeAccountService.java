package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.TypeAccount;
import com.coffee.lovers.usuarios.domain.repository.TypeAccountRepository;

public class TypeAccountService extends AbstractGenericServiceImpl<TypeAccount> {
    private final TypeAccountRepository repository;

    public TypeAccountService(TypeAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<TypeAccount> getRepository() {
        return this.repository;
    }
}
