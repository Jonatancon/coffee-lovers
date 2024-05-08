package com.coffee.lovers.product.adapters.persistence.repository;

import com.coffee.lovers.product.adapters.persistence.dao.ImageDao;
import com.coffee.lovers.product.adapters.persistence.mapper.ImageMapper;
import com.coffee.lovers.product.domain.model.ImageProduct;
import com.coffee.lovers.product.domain.persistence.ImageProductPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Repository
public class ImageProductRepository implements ImageProductPersistencePort {
    private final ImageDao dao;
    private final ImageMapper mapper;

    @Override
    public Stream<ImageProduct> findAllByProductId(Integer productId) {
        return dao.findAllByProductId_Id(productId)
                .map(mapper::toImageProduct);
    }

    @Override
    public Optional<ImageProduct> save(ImageProduct imageProduct) {
        return Optional
                .of(dao.save(mapper.toImageProductEntity(imageProduct)))
                .map(mapper::toImageProduct);
    }

    @Override
    public Optional<ImageProduct> update(ImageProduct imageProduct) {
        return Optional
                .of(dao.save(mapper.toImageProductEntity(imageProduct)))
                .map(mapper::toImageProduct);
    }

    @Override
    public void delete(String key) {
        dao.deleteById(Integer.parseInt(key));
    }

    @Override
    public Optional<ImageProduct> get(String key) {
        return dao.findById(Integer.parseInt(key))
                .map(mapper::toImageProduct);
    }
}
