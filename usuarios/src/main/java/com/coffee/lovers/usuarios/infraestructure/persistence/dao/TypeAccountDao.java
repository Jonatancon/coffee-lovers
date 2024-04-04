package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.TypeAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeAccountDao extends JpaRepository<TypeAccountEntity, Integer> {
}
