package com.coffee.lovers.product.domain.model;

public enum State {
    INACTIVE("PRODUCT INACTIVE"),
    ACTIVE("PRODUCT ACTIVE"),
    NO_STOCK("PRODUCT NO STOCK"),
    BLOCK("PRODUCT BLOCK"),;

    final String message;

    State(String message) {
        this.message = message;
    }
}
