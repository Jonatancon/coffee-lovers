package com.coffee.lovers.product.domain.model;

public class ImageProduct {
    private Integer id;
    private String url;
    private String productId;

    public ImageProduct(Integer id, String url, String productId) {
        this.id = id;
        this.url = url;
        this.productId = productId;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
