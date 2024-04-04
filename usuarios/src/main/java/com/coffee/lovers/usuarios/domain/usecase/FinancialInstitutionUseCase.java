package com.coffee.lovers.usuarios.domain.usecase;


import com.coffee.lovers.usuarios.domain.api.FinancialInstitutionPort;
import com.coffee.lovers.usuarios.domain.model.FinancialInstitution;
import com.coffee.lovers.usuarios.domain.service.FinancialInstitutionService;

public class FinancialInstitutionUseCase implements FinancialInstitutionPort {
    private final FinancialInstitutionService service;

    public FinancialInstitutionUseCase(FinancialInstitutionService service) {
        this.service = service;
    }


    @Override
    public FinancialInstitution save(FinancialInstitution financialInstitution) {
        return null;
    }

    @Override
    public FinancialInstitution update(FinancialInstitution financialInstitution) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public FinancialInstitution get(String key) {
        return null;
    }
}
