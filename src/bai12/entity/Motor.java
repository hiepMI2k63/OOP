package bai12.entity;

import java.time.LocalDate;

public class Motor extends Vehicle {
    private double Power;

    public Motor(String id, String brand, LocalDate madeYear, double price, String color, double power) {
        super(id, brand, madeYear, price, color);
        Power = power;
    }

    public double getPower() {
        return Power;
    }

    public void setPower(double power) {
        Power = power;
    }
    
    public  void showInformation()
    {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Motor [Power=" + Power + "brand=" + brand + ", color=" + color + ", id=" + id + ", madeYear=" + madeYear + ", price="
        + price + "]";
    }

}
