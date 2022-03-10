package bai12.entity;

import java.time.LocalDate;

public class Truck extends Vehicle{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Truck(String id, String brand, LocalDate madeYear, double price, String color, double weight) {
        super(id, brand, madeYear, price, color);
        this.weight = weight;
    }
    public  void showInformation()
    {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Truck [weight=" + weight + "brand=" + brand + ", color=" + color + ", id=" + id + ", madeYear=" + madeYear + ", price="
        + price + "]";
    }

  
}
