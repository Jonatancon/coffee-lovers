package com.coffee.lovers.usuarios.domain.model;

import java.util.List;

public class User {
    private String identification;
    private String names;
    private String lastNames;
    private String email;
    private String password;
    private List<Address> address;
    private String phone;
    private Image image;
    private List<Rol> roles;

    public User(){}

    public User(String identification, String names, String lastNames, String email, String password,
                List<Address> address, String phone, Image image, List<Rol> roles) {
        this.identification = identification;
        this.names = names;
        this.lastNames = lastNames;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.image = image;
        this.roles = roles;
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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Image getImages() {
        return image;
    }

    public void setImages(Image image) {
        this.image = image;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
