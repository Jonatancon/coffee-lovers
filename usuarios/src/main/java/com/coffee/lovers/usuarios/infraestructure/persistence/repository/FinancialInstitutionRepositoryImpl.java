package com.coffee.lovers.usuarios.infraestructure.persistence.repository;


import com.coffee.lovers.usuarios.domain.model.FinancialInstitution;
import com.coffee.lovers.usuarios.domain.repository.FinancialInstitutionRepository;

import java.util.Optional;

public class FinancialInstitutionRepositoryImpl implements FinancialInstitutionRepository {

    @Override
    public Optional<FinancialInstitution> save(FinancialInstitution financialInstitution) {
        return Optional.empty();
    }

    @Override
    public Optional<FinancialInstitution> update(FinancialInstitution financialInstitution) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<FinancialInstitution> get(String key) {
        return Optional.empty();
    }
}
