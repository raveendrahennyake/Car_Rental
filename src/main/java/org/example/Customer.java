package org.example;

public class Customer {
    private String CustomerId;
    private String name;

    Customer (String CustomerId,String name) {
        this.CustomerId=CustomerId;
        this.name=name;
    }
    public String getCustomerId () {
        return CustomerId ;
    }
    public String getname () {
        return name;
    }


}
