package com.coffee.lovers.usuarios.infraestructure.persistence.mapper;

import com.coffee.lovers.usuarios.domain.model.Module;
import com.coffee.lovers.usuarios.infraestructure.persistence.entity.ModuleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ModuleMapper {

    Module moduleEntityToModule(ModuleEntity moduleEntity);
    ModuleEntity moduleToModuleEntity(Module module);
}
