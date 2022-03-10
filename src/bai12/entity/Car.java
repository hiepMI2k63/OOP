package bai12.entity;

import java.time.LocalDate;

public class Car extends Vehicle{
    private int sit;
    private String engineType;
    public Car(String id, String brand, LocalDate madeYear, double price, String color, int sit, String engineType) {
        super(id, brand, madeYear, price, color);
        this.sit = sit;
        this.engineType = engineType;
    }

    public  void showInformation()
    {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Car [engineType=" + engineType + ", sit=" + sit + "brand=" + brand + ", color=" + color + ", id=" + id + ", madeYear=" + madeYear + ", price="
        + price + "]";
    }

    public int getSit() {
        return sit;
    }
    public void setSit(int sit) {
        this.sit = sit;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


}
