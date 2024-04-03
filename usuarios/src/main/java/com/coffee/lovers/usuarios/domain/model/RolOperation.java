package com.coffee.lovers.usuarios.domain.model;

import java.util.List;

public class RolOperation {
    private Rol rol;
    private List<Operation> operation;

    public RolOperation(Rol rol, List<Operation> operation) {
        this.rol = rol;
        this.operation = operation;
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
