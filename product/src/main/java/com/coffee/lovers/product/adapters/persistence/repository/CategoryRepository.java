package com.coffee.lovers.product.adapters.persistence.repository;

import com.coffee.lovers.product.adapters.persistence.dao.CategoryDao;
import com.coffee.lovers.product.adapters.persistence.mapper.CategoryMapper;
import com.coffee.lovers.product.domain.model.Category;
import com.coffee.lovers.product.domain.persistence.CategoryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
@RequiredArgsConstructor
public class CategoryRepository implements CategoryPersistencePort {
    private final CategoryDao dao;
    private final CategoryMapper mapper;

    @Override
    public Stream<Category> findAllCategoryByCoffeeId(Integer id) {
        return Stream.empty();
    }

    @Override
    public Optional<Category> save(Category category) {
        return Optional.empty();
    }

    @Override
    public Optional<Category> update(Category category) {
        return Optional.empty();
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Optional<Category> get(String key) {
        return Optional.empty();
    }
}
