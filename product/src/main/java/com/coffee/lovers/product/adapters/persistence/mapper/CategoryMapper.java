package com.coffee.lovers.product.adapters.persistence.mapper;

import com.coffee.lovers.product.adapters.persistence.entity.CategoryEntity;
import com.coffee.lovers.product.domain.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    Category toCategory (CategoryEntity categoryEntity);
    @Mapping(target = "products", ignore = true)
    CategoryEntity toCategoryEntity (Category category);
}
