package com.coffee.lovers.product.adapters.persistence.dao;

import com.coffee.lovers.product.adapters.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<CategoryEntity, Integer> {
}
