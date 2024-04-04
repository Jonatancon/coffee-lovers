package com.coffee.lovers.usuarios.infraestructure.persistence.repository;

import com.coffee.lovers.usuarios.domain.model.Image;
import com.coffee.lovers.usuarios.domain.repository.ImageRepository;
import com.coffee.lovers.usuarios.infraestructure.persistence.dao.ImageDao;
import com.coffee.lovers.usuarios.infraestructure.persistence.mapper.ImageMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class ImageRepositoryImpl implements ImageRepository {
    private final ImageDao dao;
    private final ImageMapper mapper;

    @Override
    public Optional<Image> save(Image image) {
        return Optional.of(
                dao.save(mapper.imageToImageEntity(image))
        ).map(mapper::imageEntityToImage);
    }

    @Override
    public Optional<Image> update(Image image) {
        return Optional.of(
                mapper.imageEntityToImage(
                dao.save(mapper.imageToImageEntity(image))
        ));
    }

    @Override
    public boolean delete(String key) {
        dao.findById(Integer.parseInt(key)).ifPresent(dao::delete);

        return dao.findById(Integer.parseInt(key)).isPresent();
    }

    @Override
    public Optional<Image> get(String key) {
        return dao.findById(Integer.parseInt(key)).map(mapper::imageEntityToImage);
    }
}
