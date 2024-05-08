package com.coffee.lovers.product.domain.persistence;

import com.coffee.lovers.product.domain.model.Product;
import com.coffee.lovers.repository.GenericRepository;

import java.util.stream.Stream;

public interface ProductPersistencePort extends GenericRepository<Product> {

    Stream<Product> findAllProductByCategory(String category);
}
