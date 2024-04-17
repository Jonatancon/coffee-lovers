package com.coffee.lovers.comercios.adapters.persistence.repository;

import com.coffee.lovers.comercios.adapters.message.MessagesError;
import com.coffee.lovers.comercios.adapters.persistence.dao.CoffeeStationDao;
import com.coffee.lovers.comercios.adapters.persistence.dao.ImageCoffeeDao;
import com.coffee.lovers.comercios.adapters.persistence.entity.CoffeeStationEntity;
import com.coffee.lovers.comercios.adapters.persistence.entity.ImageCoffeeShopEntity;
import com.coffee.lovers.comercios.adapters.persistence.mapper.ImageCoffeeMapper;
import com.coffee.lovers.comercios.domain.model.ImageCoffeeShop;
import com.coffee.lovers.comercios.domain.persistence.ImageCoffeeShopPersistence;
import com.coffee.lovers.model.exception.Conflict;
import com.coffee.lovers.model.exception.NotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ImageCoffeeShopPersistenceImpl implements ImageCoffeeShopPersistence {
    private final ImageCoffeeDao dao;
    private final MessagesError errorMessage;
    private final ImageCoffeeMapper mapper;
    private final CoffeeStationDao stationDao;

    @Override
    public List<ImageCoffeeShop> getAllByIdStation(String stationId) {
        return dao.findAllByCoffeeStation_Id(Integer.parseInt(stationId))
                .map(mapper::toImageCoffeeShop)
                .toList();
    }

    @Override
    public Optional<ImageCoffeeShop> save(ImageCoffeeShop imageCoffeeShop) {
        CoffeeStationEntity station = stationDao
                .findById(Integer.parseInt(imageCoffeeShop.getCoffeeStationId()))
                .orElseThrow(() -> new NotFound(errorMessage.getNotFound()));

        ImageCoffeeShopEntity entity = mapper.toImageCoffeeShopEntity(imageCoffeeShop);
        entity.setCoffeeStation(station);

        return Optional.of(
                dao.save(entity)
        ).map(mapper::toImageCoffeeShop);
    }

    @Override
    public Optional<ImageCoffeeShop> update(ImageCoffeeShop imageCoffeeShop) {
        throw new Conflict(errorMessage.getError());
    }

    @Override
    public void delete(String key) {
        dao.deleteById(Integer.parseInt(key));
    }

    @Override
    public Optional<ImageCoffeeShop> get(String key) {
        throw new Conflict(errorMessage.getError());
    }
}
