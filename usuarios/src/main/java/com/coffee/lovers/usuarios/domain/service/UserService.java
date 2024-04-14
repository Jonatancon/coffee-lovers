package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.model.exception.Conflict;
import com.coffee.lovers.model.exception.NotFound;
import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.adapters.message.MessagesError;
import com.coffee.lovers.usuarios.domain.model.User;
import com.coffee.lovers.usuarios.domain.persistence.UserPersistencePort;

public class UserService extends AbstractGenericServiceImpl<User> {
    private final UserPersistencePort persistencePort;
    private final MessagesError messagesError;

    public UserService(UserPersistencePort persistencePort, MessagesError messagesError) {
        this.persistencePort = persistencePort;
        this.messagesError = messagesError;
    }

    @Override
    protected GenericRepository<User> getRepository() {
        return this.persistencePort;
    }

    @Override
    public User update(User user) {
       return getRepository().get(user.getIdentification())
               .map(user1 -> getRepository().update(user)
                       .orElseThrow(() -> new Conflict(messagesError.getError())))
               .orElseThrow(() -> new NotFound(messagesError.getNotFound()));

    }
}
