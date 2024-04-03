package com.coffee.lovers.usuarios.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "rol_operation")
@Getter
@Setter
public class RolOperationEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", referencedColumnName = "id")
    private RolEntity rol;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_operation", referencedColumnName = "id")
    private List<OperationEntity> operation;
}
