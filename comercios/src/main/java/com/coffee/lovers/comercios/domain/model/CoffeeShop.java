package com.coffee.lovers.comercios.domain.model;

import java.util.List;

public class CoffeeShop {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String history;
    private List<CoffeeStation> coffeeStations;

    public CoffeeShop(Integer id, String name, String email, String password, String history, List<CoffeeStation> coffeeStations) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.history = history;
        this.coffeeStations = coffeeStations;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public List<CoffeeStation> getCoffeeStations() {
        return coffeeStations;
    }

    public void setCoffeeStations(List<CoffeeStation> coffeeStations) {
        this.coffeeStations = coffeeStations;
    }
}
