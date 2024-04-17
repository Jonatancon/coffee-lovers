package com.coffee.lovers.rolmodule.domain.model;

import java.util.Set;

public class Rol {
    private Integer id;
    private String name;
    private Set<RolOperation> rolOperations;
    private String description;

    public Rol(Integer id, String name, Set<RolOperation> rolOperations, String description) {
        this.id = id;
        this.name = name;
        this.rolOperations = rolOperations;
        this.description = description;
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

    public Set<RolOperation> getRolOperations() {
        return rolOperations;
    }

    public void setRolOperations(Set<RolOperation> rolOperations) {
        this.rolOperations = rolOperations;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
