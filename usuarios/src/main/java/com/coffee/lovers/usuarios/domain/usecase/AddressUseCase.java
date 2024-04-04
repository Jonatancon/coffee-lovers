package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.AddressPort;
import com.coffee.lovers.usuarios.domain.model.Address;
import com.coffee.lovers.usuarios.domain.service.AddressService;

public class AddressUseCase implements AddressPort {
    private final AddressService service;

    public AddressUseCase(AddressService service) {
        this.service = service;
    }

    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Address get(String key) {
        return null;
    }
}
