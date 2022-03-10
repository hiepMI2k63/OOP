package bai12.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bai12.entity.Car;
import bai12.entity.Motor;
import bai12.entity.Truck;
import bai12.entity.Vehicle;

public class Manager {
    private List<Vehicle> vehicles;
    public Manager()
    {
        this.vehicles = new ArrayList<>();
    }
    public void insertVehicle( Vehicle vehicle)
    {
        this.vehicles.add(vehicle);
    }
    public List<Vehicle> findAll()
    {
        return this.vehicles;
    }
    public List<Vehicle> findByBrand(String brand) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getColor().equals(brand)).collect(Collectors.toList());
    }
    public List<Vehicle> findByColor(String color) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getColor().equals(color) ).collect(Collectors.toList());
    }

    public List<Vehicle> findByColorAndBrand(String color,String brand) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getColor().equals(color)&& vehicle.getBrand().equals(brand)).collect(Collectors.toList());
    }
    public Vehicle findById(String id) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean deleteById(String id) {

        Vehicle vehicle = this.findById(id);
        if (vehicle == null) {
            return false;
        }
        this.vehicles.remove(vehicle);
        return true;
    }
    public List<Vehicle> findByColorAndCar(String color) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getColor().equals(color)&& vehicle instanceof Car ).collect(Collectors.toList());
    }
    public List<Vehicle> findByColorAndMotor(String color) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getColor().equals(color)&& vehicle instanceof Motor ).collect(Collectors.toList());
    }
    public List<Vehicle> findByColorAndTruck(String color) {
        return this.vehicles.stream().filter(vehicle -> vehicle.getColor().equals(color)&& vehicle instanceof Truck ).collect(Collectors.toList());
    }

}
