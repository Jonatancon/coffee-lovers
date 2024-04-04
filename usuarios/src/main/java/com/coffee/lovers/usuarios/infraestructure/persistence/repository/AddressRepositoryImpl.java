package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Address;
import com.coffee.lovers.usuarios.domain.repository.AddressRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.AddressDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.AddressMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class AddressRepositoryImpl implements AddressRepository {
    private final AddressDao dao;
    private final AddressMapper mapper;

    @Override
    public Optional<Address> save(Address address) {
        return Optional.of(
                mapper.addressEntityToAddress(
                    dao.save(mapper.addressToAddressEntity(address))
                )
        );
    }

    @Override
    public Optional<Address> update(Address address) {
        return save(address);
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);

        return dao.existsById(Integer.parseInt(key));
    }

    @Override
    public Optional<Address> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::addressEntityToAddress);
    }
}
