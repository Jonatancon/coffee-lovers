package com.coffee.lovers.empleados.domain.usecase;

import com.coffee.lovers.empleados.domain.api.EmployedApiPort;
import com.coffee.lovers.empleados.domain.model.Employed;
import com.coffee.lovers.empleados.domain.service.EmployedService;

public class EmployedUseCase implements EmployedApiPort {
    private final EmployedService service;

    public EmployedUseCase(EmployedService service) {
        this.service = service;
    }


    @Override
    public Employed save(Employed employed) {
        return service.save(employed);
    }

    @Override
    public Employed update(Employed employed) {
        return service.update(employed);
    }

    @Override
    public void delete(String key) {
        service.delete(key);
    }

    @Override
    public Employed get(String key) {
        return service.get(key);
    }
}
