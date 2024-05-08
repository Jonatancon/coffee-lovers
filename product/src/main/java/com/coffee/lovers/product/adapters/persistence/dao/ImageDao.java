package com.coffee.lovers.product.adapters.persistence.dao;

import com.coffee.lovers.product.adapters.persistence.entity.ImageProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface ImageDao extends JpaRepository<ImageProductEntity, Integer> {

    Stream<ImageProductEntity> findAllByProductId_Id(Integer productId);
}
