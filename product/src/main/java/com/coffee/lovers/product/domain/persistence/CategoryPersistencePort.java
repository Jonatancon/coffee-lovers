package com.coffee.lovers.product.domain.persistence;

import com.coffee.lovers.product.domain.model.Category;
import com.coffee.lovers.repository.GenericRepository;

import java.util.stream.Stream;

public interface CategoryPersistencePort extends GenericRepository<Category> {

    Stream<Category> findAllCategoryByCoffeeId(Integer id);
}
