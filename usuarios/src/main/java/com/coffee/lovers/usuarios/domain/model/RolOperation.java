package com.coffee.lovers.usuarios.domain.model;

import java.util.List;

public class RolOperation {
    private Integer id;
    private Rol rol;
    private List<Operation> operation;

    public RolOperation(Rol rol, List<Operation> operation) {
        this.rol = rol;
        this.operation = operation;
    }

    public RolOperation(Integer id, Rol rol, List<Operation> operation) {
        this.id = id;
        this.rol = rol;
        this.operation = operation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }
}
