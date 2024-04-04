package com.coffee.lovers.usuarios.domain.model;
public class Module {
    private Integer id;
    private String name;

    public Module(String name) {
        this.name = name;
    }

    public Module(Integer id, String name) {
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
