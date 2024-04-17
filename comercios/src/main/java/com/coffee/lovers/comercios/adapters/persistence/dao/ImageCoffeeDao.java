package com.coffee.lovers.comercios.adapters.persistence.dao;

import com.coffee.lovers.comercios.adapters.persistence.entity.ImageCoffeeShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface ImageCoffeeDao extends JpaRepository<ImageCoffeeShopEntity, Integer> {
    Stream<ImageCoffeeShopEntity> findAllByCoffeeStation_Id(Integer coffeeStationId);
}
