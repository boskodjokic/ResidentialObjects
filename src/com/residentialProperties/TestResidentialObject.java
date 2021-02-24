package com.residentialProperties;

import java.util.Scanner;

public class TestResidentialObject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the address of residential object:");
        String address = sc.nextLine();
        System.out.println("Enter the residential object of your choice (h-house, b-building):");
        String objectIdentifier = sc.nextLine();

        while (check(objectIdentifier) != true) {
            System.out.println("You have entered wrong object");
            System.out.println("Enter the residential object of your choice (h-house, b-building):");
            objectIdentifier = sc.next();
        }

        if (objectIdentifier.equals("h")) {
            System.out.println("Enter the area of the house:");
            double area = new Scanner(System.in).nextDouble();
            System.out.println("Enter number of tennats:");
            int numberOfTennants = new Scanner(System.in).nextInt();
            System.out.println("Enter the tax per square meter:");
            double taxPerM2 = new Scanner(System.in).nextDouble();
            House house = new House(address, area, numberOfTennants);
            System.out.println(house.toString());
            System.out.println("Total tax ammount is: " + house.tax(taxPerM2) + ".");
        } else {
            System.out.println("Enter number of appartments in buiding:");
            int numberOfAppartments = sc.nextInt();
            Appartment[] appartmentArray = new Appartment[numberOfAppartments];
            Building building = new Building(address, appartmentArray);
            System.out.println("Enter tax per square meter:");
            double ammount = new Scanner(System.in).nextDouble();
            System.out.println(building.toString());
            System.out.println("Total tax ammount is: " + building.tax(ammount) + ".");
        }

    }

    public static boolean check(String objectIdentifier) {
        if (objectIdentifier.equals("h") || objectIdentifier.equals("b"))
            return true;
        else
            return false;

    }
}
