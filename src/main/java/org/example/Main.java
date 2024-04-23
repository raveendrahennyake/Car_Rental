package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Car obj1 = new Car("CC1", "BMW", "X5", 10);
        Car obj2 = new Car("CC2", "AUDI", "Y5", 15);
        Car obj3 = new Car("CC3", "M-BENZ", "Z5", 20);

        rentalSystem.addCar(obj1);
        rentalSystem.addCar(obj2);
        rentalSystem.addCar(obj3);

        rentalSystem.Menu(); // Display the menu

        RentalSystem Start=new RentalSystem();
        Start.Menu();
    }
}
