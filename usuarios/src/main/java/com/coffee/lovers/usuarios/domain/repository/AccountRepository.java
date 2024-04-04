package com.coffee.lovers.usuarios.domain.repository;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.usuarios.domain.model.Account;

import java.util.stream.Stream;

public interface AccountRepository extends GenericRepository<Account> {
    Stream<Account> getAllAccountByUser(String identification);
}
