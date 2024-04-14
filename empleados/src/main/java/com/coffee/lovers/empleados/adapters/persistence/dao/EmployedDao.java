package com.coffee.lovers.empleados.adapters.persistence.dao;

import com.coffee.lovers.empleados.adapters.persistence.entity.EmployedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployedDao extends JpaRepository<EmployedEntity, Integer> {
    void deleteByIdentification(String identification);
    Optional<EmployedEntity> findByIdentification(String identification);
}
