package com.coffee.lovers.comercios.adapters.persistence.mapper;

import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeStationEntity;
import com.coffee.lovers.comercios.domain.model.CoffeeStation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = ImageCoffeeMapper.class)
public interface CoffeeStationMapper {

    @Mapping(target = "coffeeShopId", ignore = true)
    CoffeeStation toCoffeeStation(CoffeeStationEntity coffeeStationEntity);
    @Mapping(target = "coffeeShop", ignore = true)
    CoffeeStationEntity toCoffeeStationEntity(CoffeeStation coffeeStation);
    List<CoffeeStation> toCoffeeStations(List<CoffeeStationEntity> coffeeStationEntities);
    List<CoffeeStationEntity> toCoffeeStationEntities(List<CoffeeStation> coffeeStations);
}
