package com.coffee.lovers.comercios.adapters.persistence.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "coffee_station")
@RequiredArgsConstructor
public class CoffeeStationEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String addressId;
    @ManyToOne
    @JoinColumn(name = "id_coffee_shop", referencedColumnName = "id")
    private CoffeeShopEntity coffeeShop;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE})
    private List<ImageCoffeeShopEntity> imageCoffeeShops;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public CoffeeShopEntity getCoffeeShop() {
        return coffeeShop;
    }

    public void setCoffeeShop(CoffeeShopEntity coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    public List<ImageCoffeeShopEntity> getImageCoffeeShops() {
        return imageCoffeeShops;
    }

    public void setImageCoffeeShops(List<ImageCoffeeShopEntity> imageCoffeeShops) {
        this.imageCoffeeShops = imageCoffeeShops;
    }
}
