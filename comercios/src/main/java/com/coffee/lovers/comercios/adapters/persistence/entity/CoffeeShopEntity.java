package com.coffee.lovers.comercios.adapters.persistence.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "coffee_shop")
@RequiredArgsConstructor
public class CoffeeShopEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String history;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.REMOVE})
    private List<CoffeeStationEntity> coffeeStations;

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

    public List<CoffeeStationEntity> getCoffeeStations() {
        return coffeeStations;
    }

    public void setCoffeeStations(List<CoffeeStationEntity> coffeeStations) {
        this.coffeeStations = coffeeStations;
    }
}
