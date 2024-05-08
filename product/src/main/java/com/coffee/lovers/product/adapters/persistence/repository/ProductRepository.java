package com.coffee.lovers.product.adapters.persistence.repository;

import com.coffee.lovers.product.adapters.persistence.dao.ProductDao;
import com.coffee.lovers.product.adapters.persistence.mapper.ProductMapper;
import com.coffee.lovers.product.domain.model.Product;
import com.coffee.lovers.product.domain.persistence.ProductPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@RequiredArgsConstructor
@Repository
public class ProductRepository implements ProductPersistencePort {
    private final ProductDao dao;
    private final ProductMapper mapper;

    @Override
    public Stream<Product> findAllProductByCategory(String category) {
        return dao.findAllByCategoryId_Id(Integer.parseInt(category))
                .map(mapper::toProduct);
    }

    @Override
    public Optional<Product> save(Product product) {
        return Optional
                .of(dao.save(mapper.toProductEntity(product)))
                .map(mapper::toProduct);
    }

    @Override
    public Optional<Product> update(Product product) {
        return Optional
                .of(dao.save(mapper.toProductEntity(product)))
                .map(mapper::toProduct);
    }

    @Override
    public void delete(String key) {
        dao.deleteById(Integer.parseInt(key));
    }

    @Override
    public Optional<Product> get(String key) {
        return dao.findById(Integer.parseInt(key))
                .map(mapper::toProduct);
    }
}
