package com.coffee.lovers.model;

public enum Constants {
    ERROR_CREATE_ELEMENT("ERROR CREATE THIS ELEMENT"),
    NOT_FOUND_ELEMENT("ERROR NOT FOUND ELEMENT --> ");


    Constants(String s) {
        this.message = s;
    }

    private final String message;

    public String getMessage() {
        return this.message;
    }
}
