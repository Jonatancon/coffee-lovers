package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.Address;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address addressEntityToAddress(AddressEntity addressEntity);
    AddressEntity addressToAddressEntity(Address address);
}
