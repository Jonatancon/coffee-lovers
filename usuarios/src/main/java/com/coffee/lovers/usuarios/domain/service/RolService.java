package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.Rol;
import com.coffee.lovers.usuarios.domain.repository.RolRepository;

public class RolService extends AbstractGenericServiceImpl<Rol> {
    private final RolRepository repository;

    public RolService(RolRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Rol> getRepository() {
        return this.repository;
    }
}
