package com.coffee.lovers.usuarios.domain.repository;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.usuarios.domain.model.TypeAccount;

import java.util.stream.Stream;

public interface TypeAccountRepository extends GenericRepository<TypeAccount> {
    Stream<TypeAccount> getAll();
}
