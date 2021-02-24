package com.residentialProperties;

public class Appartment {

    private double area;
    private int numberOfTennants;

    Appartment() {
    }

    public double getArea() {
        return area;
    }

    public int getNumberOfTennants() {
        return numberOfTennants;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNumberOfTennants(int numberOfTennants) {
        this.numberOfTennants = numberOfTennants;
    }

    @Override
    public String toString() {
        return "Area of appartment is " + area + " m^2.\nNumber of tennants is " + numberOfTennants + ".";
    }

}
