package com.residentialProperties;

public class House extends ResidentialObject {

    Appartment appartment = new Appartment();

    House(String address, double area, int tennants) {
        super.setAddress(address);
        appartment.setArea(area);
        appartment.setNumberOfTennants(tennants);
    }

    @Override
    double tax(double pricePerM2) {
        if (appartment.getNumberOfTennants() <= 2) {
            return appartment.getArea() * pricePerM2;
        } else {
            return appartment.getArea() * pricePerM2 * (1 - (appartment.getNumberOfTennants() - 2) * 0.05);
        }
    }

    @Override
    public String toString() {
        return "House:\nAddress: " + super.getAddress() + "\nArea of appartment is " + appartment.getArea() + " m^2.\nNumber of tennants " + appartment.getNumberOfTennants() + ".";
    }
}