package com.coffee.lovers.usuarios.infraestructure.persistence.dao;


import com.coffee.lovers.usuarios.infraestructure.persistence.entity.FinancialInstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialInstitutionDao extends JpaRepository<Integer, FinancialInstitutionEntity> {
}
