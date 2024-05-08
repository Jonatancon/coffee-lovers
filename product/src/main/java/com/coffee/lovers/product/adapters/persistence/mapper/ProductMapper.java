package com.coffee.lovers.product.adapters.persistence.mapper;

import com.coffee.lovers.product.adapters.persistence.entity.ProductEntity;
import com.coffee.lovers.product.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {ImageMapper.class})
public interface ProductMapper {

    @Mapping(target = "categoryId", source = "categoryId.id")
    Product toProduct(ProductEntity productEntity);
    @Mapping(target = "categoryId.id", source = "categoryId")
    ProductEntity toProductEntity(Product product);
}
