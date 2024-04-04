package com.coffee.lovers.usuarios.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identification;
    private String names;
    private String lastNames;
    private String email;
    private String password;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "id_address", referencedColumnName = "id")
    private List<AddressEntity> address;
    private String phone;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "id_image", referencedColumnName = "id")
    private ImageEntity image;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", referencedColumnName = "id")
    private List<RolEntity> roles;

}
