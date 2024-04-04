package com.coffee.lovers.usuarios.domain.usecase;

import com.coffee.lovers.usuarios.domain.api.ImagePort;
import com.coffee.lovers.usuarios.domain.model.Image;
import com.coffee.lovers.usuarios.domain.service.ImageService;

public class ImageUseCase implements ImagePort {
    private final ImageService service;

    public ImageUseCase(ImageService service) {
        this.service = service;
    }

    @Override
    public Image save(Image image) {
        return null;
    }

    @Override
    public Image update(Image image) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public Image get(String key) {
        return null;
    }
}
