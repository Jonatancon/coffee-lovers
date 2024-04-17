package com.coffee.lovers.comercios.adapters.persistence.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Image_coffee")
@RequiredArgsConstructor
public class ImageCoffeeShopEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String url;
    @ManyToOne
    @JoinColumn(name = "coffee_station_id", referencedColumnName = "id")
    private CoffeeStationEntity coffeeStation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CoffeeStationEntity getCoffeeStation() {
        return coffeeStation;
    }

    public void setCoffeeStation(CoffeeStationEntity coffeeStation) {
        this.coffeeStation = coffeeStation;
    }
}
