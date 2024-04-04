package com.coffee.lovers.usuarios.domain.repository;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.usuarios.domain.model.Rol;

import java.util.stream.Stream;

public interface RolRepository extends GenericRepository<Rol> {
    Stream<Rol> getAll();
}
