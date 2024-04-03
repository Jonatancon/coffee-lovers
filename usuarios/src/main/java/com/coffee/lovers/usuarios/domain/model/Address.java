package com.coffee.lovers.usuarios.domain.model;
public class Address {
    private String country;
    private String department;
    private String municipality;
    private String nomenclature;
    private boolean defaultAddress;

    public Address(){}
    public Address(String country, String department, String municipality, String nomenclature, boolean defaultAddress) {
        this.country = country;
        this.department = department;
        this.municipality = municipality;
        this.nomenclature = nomenclature;
        this.defaultAddress = defaultAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature = nomenclature;
    }

    public boolean isDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", department='" + department + '\'' +
                ", municipality='" + municipality + '\'' +
                ", nomenclature='" + nomenclature + '\'' +
                ", defaultAddress=" + defaultAddress +
                '}';
    }
}
