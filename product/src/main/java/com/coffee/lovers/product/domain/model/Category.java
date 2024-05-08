package com.coffee.lovers.product.domain.model;

public class Category {
    private int id;
    private String name;
    private String coffeeStationId;

    public Category(int id, String name, String coffeeStationId) {
        this.id = id;
        this.name = name;
        this.coffeeStationId = coffeeStationId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffeeStationId() {
        return coffeeStationId;
    }

    public void setCoffeeStationId(String coffeeStationId) {
        this.coffeeStationId = coffeeStationId;
    }
}
