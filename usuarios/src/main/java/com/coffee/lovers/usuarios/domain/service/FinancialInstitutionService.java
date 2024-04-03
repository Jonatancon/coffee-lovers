package com.coffee.lovers.usuarios.domain.service;


import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.FinancialInstitution;
import com.coffee.lovers.usuarios.domain.repository.FinancialInstitutionRepository;

public class FinancialInstitutionService extends AbstractGenericServiceImpl<FinancialInstitution> {
    private final FinancialInstitutionRepository repository;

    public FinancialInstitutionService(FinancialInstitutionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<FinancialInstitution> getRepository() {
        return this.repository;
    }
}
