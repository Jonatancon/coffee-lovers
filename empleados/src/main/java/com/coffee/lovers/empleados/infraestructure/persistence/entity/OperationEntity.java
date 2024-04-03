package com.coffee.lovers.empleados.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "operation")
@Getter
@Setter
public class OperationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_module", referencedColumnName = "id")
    private List<ModuleEntity> module;
}
