package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Car> cars;
    private  List <Customer> customers;
    private List<Rental>rentals;

    public RentalSystem () {
        cars=new ArrayList<>();
        customers=new ArrayList<>();
        rentals=new ArrayList<>();
    }
    public void addCar(Car car) {
      cars.add(car);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void rentCar (Car car,Customer customer,int days) {
//        if (car.isavailable()){
//
//
//        }


    }






}


