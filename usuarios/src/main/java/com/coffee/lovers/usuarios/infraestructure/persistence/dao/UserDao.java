package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByIdentification(String identification);
}
