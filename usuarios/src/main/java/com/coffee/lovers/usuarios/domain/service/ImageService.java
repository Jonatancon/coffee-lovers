package com.coffee.lovers.usuarios.domain.service;

import com.coffee.lovers.repository.GenericRepository;
import com.coffee.lovers.service.AbstractGenericServiceImpl;
import com.coffee.lovers.usuarios.domain.model.Image;
import com.coffee.lovers.usuarios.domain.repository.ImageRepository;

public class ImageService extends AbstractGenericServiceImpl<Image> {
    private final ImageRepository repository;

    public ImageService(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Image> getRepository() {
        return this.repository;
    }
}
