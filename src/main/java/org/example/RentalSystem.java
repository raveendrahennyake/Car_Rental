package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public RentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void rentCar(Car car, Customer customer, int days) {
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));
        } else {
            System.out.println("this is car is not Avaloiale");
        }
    }
//Car Return type
    public void returnCar(Car car) {
        car.returnCar();
    }


    //System out out
    public void Menu() {
        Scanner x = new Scanner(System.in);
        System.out.println("===== Car Rental System =====");
        System.out.println("1. Rent a Car");
        System.out.println("2. Return a Car");
        System.out.println("3. Exit System");
        System.out.print("Enter your choice: ");
        // Choice Select
        int your_choice = x.nextInt();
        x.nextLine(); // Consume the newline character

        if (your_choice == 1) {
            System.out.print("Enter your name: ");
            String name = x.nextLine();

            System.out.println("\nAvailable Cars:");
            for (Car car : cars) {
                if (car.isAvailable()) {
                    System.out.println(car.getCarid() + " - " + car.getCarBrand() + " " + car.getCarmode());
                }
            }
        }

    }
}


