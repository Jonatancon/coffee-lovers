package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao extends JpaRepository<Integer, RolEntity> {
}
