package com.residentialProperties;

import java.util.Scanner;

public class Building extends ResidentialObject {

    Appartment[] appartmentArray;

    Building(String address, Appartment[] appartmentArray) {

        super.setAddress(address);
        this.appartmentArray = appartmentArray;

        for (int i = 0; i < appartmentArray.length; i++) {
            appartmentArray[i] = new Appartment();
            System.out.println("Enter the area for appartment: " + (i + 1));
            double area = new Scanner(System.in).nextDouble();
            System.out.println("Enter the number of tennats for appartment: " + (i + 1));
            int appartmentNumber = new Scanner(System.in).nextInt();
            appartmentArray[i].setArea(area);
            appartmentArray[i].setNumberOfTennants(appartmentNumber);
        }
    }

    @Override
    double tax(double pricePerM2) {
        double totalTax = 0;
        for (int i = 0; i < appartmentArray.length; i++) {
            if (appartmentArray[i].getNumberOfTennants() <= 2) {
                double tax1 = appartmentArray[i].getArea() * pricePerM2;
                totalTax += tax1;
            } else {
                double tax2 = appartmentArray[i].getArea() * pricePerM2 * (1 - (appartmentArray[i].getNumberOfTennants() - 2) * 0.05);
                totalTax += tax2;
            }
        }
        return totalTax;
    }

    @Override
    public String toString() {
        String str = "Building:\nAddress: " + super.getAddress() + "\n";
        for (int i = 0; i < appartmentArray.length; i++) {
            str += (i + 1) + ". appartment:\n";
            str += appartmentArray[i].toString() + "\n";
        }
        return str;
    }
}
