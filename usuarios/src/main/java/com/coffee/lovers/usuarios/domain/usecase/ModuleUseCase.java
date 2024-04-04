package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.ModulePort;
import com.coffee.lovers.usuarios.domain.service.ModuleService;

public class ModuleUseCase implements ModulePort {
    private final ModuleService service;

    public ModuleUseCase(ModuleService service) {
        this.service = service;
    }

    @Override
    public Module save(Module module) {
        return null;
    }

    @Override
    public Module update(Module module) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Module get(String key) {
        return null;
    }
}
