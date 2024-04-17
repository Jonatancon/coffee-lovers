package com.coffee.lovers.comercios.adapters.persistence.mapper;

import com.coffee.lovers.comercios.adapters.persistence.entity.ImageCoffeeShopEntity;
import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ImageCoffeeMapper {

    @Mapping(target = "coffeeStationId", ignore = true)
    ImageCoffeeShop toImageCoffeeShop(ImageCoffeeShopEntity imageCoffeeShopEntity);
    @Mapping(target = "coffeeStation", ignore = true)
    ImageCoffeeShopEntity toImageCoffeeShopEntity(ImageCoffeeShop imageCoffeeShop);
    List<ImageCoffeeShop> toImageCoffeeShops(List<ImageCoffeeShopEntity> imageCoffeeShopEntities);
    List<ImageCoffeeShopEntity> toImageCoffeeShopEntities(List<ImageCoffeeShop> imageCoffeeShops);
}
