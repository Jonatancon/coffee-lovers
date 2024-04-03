package com.coffee.lovers.usuarios.domain.model;

import java.util.List;

public class Operation {
    private String name;
    private List<Module> module;

    public Operation(){}
    public Operation(String name, List<Module> module) {
        this.name = name;
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Module> getModule() {
        return module;
    }

    public void setModule(List<Module> module) {
        this.module = module;
    }
}
