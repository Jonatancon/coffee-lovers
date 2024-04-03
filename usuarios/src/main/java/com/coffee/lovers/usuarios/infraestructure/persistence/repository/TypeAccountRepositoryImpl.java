package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.TypeAccount;
import com.coffee.lovers.usuarios.domain.repository.TypeAccountRepository;

import java.util.Optional;

public class TypeAccountRepositoryImpl implements TypeAccountRepository {

    @Override
    public Optional<TypeAccount> save(TypeAccount typeAccount) {
        return Optional.empty();
    }

    @Override
    public Optional<TypeAccount> update(TypeAccount typeAccount) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<TypeAccount> get(String key) {
        return Optional.empty();
    }
}
