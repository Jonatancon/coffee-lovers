package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.Account;
import com.coffee.lovers.usuarios.domain.repository.AccountRepository;

public class AccountService extends AbstractGenericServiceImpl<Account> {
    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Account> getRepository() {
        return this.repository;
    }
}
