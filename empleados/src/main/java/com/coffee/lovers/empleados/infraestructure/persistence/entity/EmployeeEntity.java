package com.coffee.lovers.empleados.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identification;
    private String names;
    private String lastNames;
    private String email;
    private String password;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address", referencedColumnName = "id")
    private List<AddressEntity> address;
    private String phone;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "id_image", referencedColumnName = "id")
    private List<ImageEntity> images;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", referencedColumnName = "id")
    private List<RolEntity> roles;
}
