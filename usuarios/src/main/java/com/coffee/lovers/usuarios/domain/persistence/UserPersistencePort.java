package com.coffee.lovers.usuarios.domain.persistence;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.usuarios.domain.model.User;

public interface UserPersistencePort extends GenericRepository<User> {
}
