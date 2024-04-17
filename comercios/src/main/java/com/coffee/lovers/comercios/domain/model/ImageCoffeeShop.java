package com.coffee.lovers.comercios.domain.model;

public class ImageCoffeeShop {
    private Integer id;
    private String url;
    private String coffeeStationId;

    public ImageCoffeeShop(Integer id, String url, String coffeeStationId) {
        this.id = id;
        this.url = url;
        this.coffeeStationId = coffeeStationId;
    }

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

    public String getCoffeeStationId() {
        return coffeeStationId;
    }

    public void setCoffeeStationId(String coffeeStationId) {
        this.coffeeStationId = coffeeStationId;
    }
}
