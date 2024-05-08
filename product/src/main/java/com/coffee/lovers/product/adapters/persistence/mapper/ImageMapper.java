package com.coffee.lovers.product.adapters.persistence.mapper;

import com.coffee.lovers.product.adapters.persistence.entity.ImageProductEntity;
import com.coffee.lovers.product.domain.model.ImageProduct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ImageMapper {

    @Mapping(target = "productId", source = "productId.id")
    ImageProduct toImageProduct(ImageProductEntity imageProductEntity);
    @Mapping(target = "productId.id", source = "productId")
    ImageProductEntity toImageProductEntity(ImageProduct imageProduct);
}
