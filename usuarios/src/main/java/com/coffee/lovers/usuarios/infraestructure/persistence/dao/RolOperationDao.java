package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.RolOperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolOperationDao extends JpaRepository<RolOperationEntity, Integer> {
}
