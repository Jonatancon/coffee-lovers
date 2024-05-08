package com.coffee.lovers.product.domain.model;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private String categoryId;
    private State state;
    private boolean market;
    private List<ImageProduct> imagesProduct;

    public Product(Integer id, String name, String description, BigDecimal price, String categoryId, State state, boolean market, List<ImageProduct> imagesProduct) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.state = state;
        this.market = market;
        this.imagesProduct = imagesProduct;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isMarket() {
        return market;
    }

    public void setMarket(boolean market) {
        this.market = market;
    }

    public List<ImageProduct> getImagesProduct() {
        return imagesProduct;
    }

    public void setImagesProduct(List<ImageProduct> imagesProduct) {
        this.imagesProduct = imagesProduct;
    }
}
