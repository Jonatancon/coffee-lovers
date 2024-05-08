package com.coffee.lovers.product.adapters.persistence.dao;

import com.coffee.lovers.product.adapters.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface ProductDao extends JpaRepository<ProductEntity, Integer> {

    Stream<ProductEntity> findAllByCategoryId_Id(Integer categoryId);
}
