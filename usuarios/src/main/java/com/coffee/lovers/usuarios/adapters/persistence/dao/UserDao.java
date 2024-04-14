package com.coffee.lovers.usuarios.adapters.persistence.dao;

import com.coffee.lovers.usuarios.adapters.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
    void deleteByIdentification(String identification);
    Optional<UserEntity> findByIdentification(String identification);
}
