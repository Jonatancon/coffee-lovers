package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.repository.ModuleRepository;

public class ModuleService extends AbstractGenericServiceImpl<Module> {
    private final ModuleRepository repository;

    public ModuleService(ModuleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Module> getRepository() {
        return this.repository;
    }
}
