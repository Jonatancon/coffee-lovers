package com.coffee.lovers.usuarios.domain.model;

public class TypeAccount{
    private Integer id;
    private String name;

    public TypeAccount(String name) {
        this.name = name;
    }

    public TypeAccount(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
