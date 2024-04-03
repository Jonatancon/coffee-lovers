package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Account;
import com.coffee.lovers.usuarios.domain.repository.AccountRepository;

import java.util.Optional;

public class AccountRepositoryImpl implements AccountRepository {

    @Override
    public Optional<Account> save(Account account) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> update(Account account) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<Account> get(String key) {
        return Optional.empty();
    }
}
