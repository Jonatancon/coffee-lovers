package com.coffee.lovers.usuarios.domain.repository;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.usuarios.domain.model.RolOperation;

import java.util.stream.Stream;

public interface RolOperationRepository extends GenericRepository<RolOperation> {
    Stream<RolOperation> getAll();
}
