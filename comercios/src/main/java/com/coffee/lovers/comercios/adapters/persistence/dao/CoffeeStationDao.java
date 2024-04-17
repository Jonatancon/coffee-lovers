package com.coffee.lovers.comercios.adapters.persistence.dao;

import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeStationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface CoffeeStationDao extends JpaRepository<CoffeeStationEntity, Integer> {
    Stream<CoffeeStationEntity> findAllByCoffeeShopId(Integer coffeeShopId);
}
