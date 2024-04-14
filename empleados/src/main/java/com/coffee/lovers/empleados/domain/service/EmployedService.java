package com.coffee.lovers.empleados.domain.service;

import com.coffee.lovers.empleados.adapters.message.MessagesError;
import com.coffee.lovers.empleados.domain.model.Employed;
import com.coffee.lovers.empleados.domain.persistence.EmployedPersistencePort;
import com.coffee.lovers.model.exception.Conflict;
import com.coffee.lovers.model.exception.NotFound;
import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;

public class EmployedService extends AbstractGenericServiceImpl<Employed> {
    private final EmployedPersistencePort persistence;
    private final MessagesError messagesError;

    public EmployedService(EmployedPersistencePort persistence, MessagesError messagesError) {
        this.persistence = persistence;
        this.messagesError = messagesError;
    }

    @Override
    protected GenericRepository<Employed> getRepository() {
        return this.persistence;
    }

    @Override
    public Employed update(Employed employed) {
        return getRepository().get(employed.getIdentification())
                .map(user1 -> getRepository().update(employed)
                        .orElseThrow(() -> new Conflict(messagesError.getError())))
                .orElseThrow(() -> new NotFound(messagesError.getNotFound()));

    }
}
