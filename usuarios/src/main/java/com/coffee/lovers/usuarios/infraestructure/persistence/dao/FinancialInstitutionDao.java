package com.coffee.lovers.usuarios.infraestructure.persistence.dao;


import com.coffee.lovers.usuarios.infraestructure.persistence.entity.FinancialInstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FinancialInstitutionDao extends JpaRepository<FinancialInstitutionEntity, Integer> {
    Optional<FinancialInstitutionEntity> findByName(String name);
    boolean existsByName(String name);
}
