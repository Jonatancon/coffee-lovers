package com.coffee.lovers.product.domain.persistence;

import com.coffee.lovers.product.domain.model.ImageProduct;
import com.coffee.lovers.repository.GenericRepository;

import java.util.stream.Stream;

public interface ImageProductPersistencePort extends GenericRepository<ImageProduct> {
    Stream<ImageProduct> findAllByProductId(Integer productId);
}
