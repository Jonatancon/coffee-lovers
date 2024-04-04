package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.OperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDao extends JpaRepository<OperationEntity, Integer> {
}
