package com.coffee.lovers.usuarios.domain.model;

import java.util.List;

public class User {
    private Integer id;
    private String identification;
    private String names;
    private String lastNames;
    private String email;
    private String password;
    private String addressId;
    private String phoneId;
    private ImageUser imageUser;
    private String roles;

    public User(Integer id, String identification, String names, String lastNames, String email, String password,
                String addressId, String phoneId, ImageUser imageUser, String roles) {
        this.id = id;
        this.identification = identification;
        this.names = names;
        this.lastNames = lastNames;
        this.email = email;
        this.password = password;
        this.addressId = addressId;
        this.phoneId = phoneId;
        this.imageUser = imageUser;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public ImageUser getImageUser() {
        return imageUser;
    }

    public void setImageUser(ImageUser imageUser) {
        this.imageUser = imageUser;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
