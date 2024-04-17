package com.coffee.lovers.rolmodule.domain.model;

import java.util.Set;

public class Operation {
    private Integer id;
    private String name;
    private Set<Module> modules;

    public Operation(Integer id, String name, Set<Module> modules) {
        this.id = id;
        this.name = name;
        this.modules = modules;
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

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }
}
