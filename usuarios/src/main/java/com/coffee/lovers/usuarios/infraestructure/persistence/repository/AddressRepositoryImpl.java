package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Address;
import com.coffee.lovers.usuarios.domain.repository.AddressRepository;

import java.util.Optional;

public class AddressRepositoryImpl implements AddressRepository {
    @Override
    public Optional<Address> save(Address address) {
        return Optional.empty();
    }

    @Override
    public Optional<Address> update(Address address) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<Address> get(String key) {
        return Optional.empty();
    }
}
