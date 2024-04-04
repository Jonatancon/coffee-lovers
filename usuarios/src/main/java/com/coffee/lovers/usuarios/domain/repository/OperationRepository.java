package com.coffee.lovers.usuarios.domain.repository;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.usuarios.domain.model.Operation;

import java.util.stream.Stream;

public interface OperationRepository extends GenericRepository<Operation> {
    Stream<Operation> getAll();
}
