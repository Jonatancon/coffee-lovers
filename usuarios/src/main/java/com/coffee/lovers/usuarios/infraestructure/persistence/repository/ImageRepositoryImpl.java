package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Image;
import com.coffee.lovers.usuarios.domain.repository.ImageRepository;

import java.util.Optional;

public class ImageRepositoryImpl implements ImageRepository {

    @Override
    public Optional<Image> save(Image image) {
        return Optional.empty();
    }

    @Override
    public Optional<Image> update(Image image) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String key) {
        return false;
    }

    @Override
    public Optional<Image> get(String key) {
        return Optional.empty();
    }
}
