package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.AccountPort;
import com.coffee.lovers.usuarios.domain.model.Account;
import com.coffee.lovers.usuarios.domain.service.AccountService;

public class AccountUseCase implements AccountPort {
    private final AccountService service;

    public AccountUseCase(AccountService service) {
        this.service = service;
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public Account update(Account account) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Account get(String key) {
        return null;
    }
}
