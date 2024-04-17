package com.coffee.lovers.comercios.adapters.persistence.mapper;

import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeShopEntity;
import com.coffee.lovers.comercios.domain.model.CoffeeShop;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = CoffeeStationMapper.class)
public interface CoffeeShopMapper {

    CoffeeShop toCoffeeShop(CoffeeShopEntity coffeeShopEntity);
    CoffeeShopEntity toCoffeeShopEntity(CoffeeShop coffeeShop);
}
