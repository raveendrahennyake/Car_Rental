package org.example;

public class Car {
     private String Carid;
    private String CarBrand;
    private String Carmode;
    private int Perdayprice;
    private boolean isavaliable;

    public Car (String Carid,String CarBrand,String Carmode,int Perdayprice) {
        this.Carid=Carid;
        this.CarBrand=CarBrand;
        this.Carmode=Carmode;
        this.Perdayprice=Perdayprice;
        this.isavaliable=true;
    }
    public String getCarid () {
        return Carid;
    }

    public String getCarBrand () {
        return CarBrand;
    }

    public String getCarmode () {
        return Carmode;
    }
    public int getPerdayprice () {
        return Perdayprice;
    }
    public double calulatePrice (int rentalDays) {
        return rentalDays*Perdayprice;

    }
    public boolean isavailable() {
        return isavaliable;
    }







    }














