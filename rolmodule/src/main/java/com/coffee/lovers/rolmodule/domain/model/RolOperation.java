package com.coffee.lovers.rolmodule.domain.model;

public class RolOperation {
    private Integer id;
    private Operation operation;

    public RolOperation(Integer id, Operation operation) {
        this.id = id;
        this.operation = operation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
