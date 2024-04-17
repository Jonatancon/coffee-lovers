package com.coffee.lovers.comercios.domain.model;

import java.util.List;

public class CoffeeStation {
    private Integer id;
    private String name;
    private String addressId;
    private String coffeeShopId;
    private List<ImageCoffeeShop> imageCoffeeShops;

    public CoffeeStation(Integer id, String name, String addressId, String coffeeShopId, List<ImageCoffeeShop> imageCoffeeShops) {
        this.id = id;
        this.name = name;
        this.addressId = addressId;
        this.coffeeShopId = coffeeShopId;
        this.imageCoffeeShops = imageCoffeeShops;
    }

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

    public String getCoffeeShopId() {
        return coffeeShopId;
    }

    public void setCoffeeShopId(String coffeeShopId) {
        this.coffeeShopId = coffeeShopId;
    }

    public List<ImageCoffeeShop> getImageCoffeeShops() {
        return imageCoffeeShops;
    }

    public void setImageCoffeeShops(List<ImageCoffeeShop> imageCoffeeShops) {
        this.imageCoffeeShops = imageCoffeeShops;
    }
}
