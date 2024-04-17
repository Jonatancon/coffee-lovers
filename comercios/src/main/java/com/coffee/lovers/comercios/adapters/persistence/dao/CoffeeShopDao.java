package com.coffee.lovers.comercios.adapters.persistence.dao;

import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeShopDao extends JpaRepository<CoffeeShopEntity, Integer> {
}
