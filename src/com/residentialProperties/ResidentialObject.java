package com.residentialProperties;

public abstract class ResidentialObject {

    String address;

    ResidentialObject() {
    }

    abstract double tax(double pricePerM2);

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }
}