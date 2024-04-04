package com.coffee.lovers.usuarios.infraestructure.persistence.dao;

import com.coffee.lovers.usuarios.infraestructure.persistence.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<AddressEntity, Integer> {
}
