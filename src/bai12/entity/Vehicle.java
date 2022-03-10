package bai12.entity;

import java.time.LocalDate;

public abstract class Vehicle {
    protected String id;// 
    protected String brand;
    protected LocalDate madeYear;
    protected double price;
    protected String color;
    public Vehicle(String id, String brand, LocalDate madeYear, double price, String color) {
        this.id = id;
        this.brand = brand;
        this.madeYear = madeYear;
        this.price = price;
        this.color = color;
    }
    public abstract void showInformation();
    
    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", color=" + color + ", id=" + id + ", madeYear=" + madeYear + ", price="
                + price + "]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public LocalDate getMadeYear() {
        return madeYear;
    }
    public void setMadeYear(LocalDate madeYear) {
        this.madeYear = madeYear;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
