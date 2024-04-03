package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.Address;
import com.coffee.lovers.usuarios.domain.repository.AddressRepository;

public class AddressService extends AbstractGenericServiceImpl<Address> {
    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Address> getRepository() {
        return this.repository;
    }
}
