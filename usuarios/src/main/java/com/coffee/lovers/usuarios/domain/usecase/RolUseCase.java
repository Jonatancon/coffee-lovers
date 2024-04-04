package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.RolPort;
import com.coffee.lovers.usuarios.domain.model.Rol;
import com.coffee.lovers.usuarios.domain.service.RolService;

public class RolUseCase implements RolPort {
    private final RolService service;

    public RolUseCase(RolService service) {
        this.service = service;
    }

    @Override
    public Rol save(Rol rol) {
        return null;
    }

    @Override
    public Rol update(Rol rol) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Rol get(String key) {
        return null;
    }
}
