package bai12.UI;

import java.time.LocalDate;
import java.util.Scanner;

import bai12.entity.Car;
import bai12.entity.Motor;
import bai12.entity.Truck;
import bai12.entity.Vehicle;
import bai12.exception.YearMadeException;
import bai12.service.Manager;
import bai12.service.ValidatorService;

public class UIVehicle {
    private Manager manager =  new Manager();
    public void insert( int type)
    {
        Vehicle vehicle = null;
        if(type ==1 )
        {
              vehicle = createCar();
        }
        if(type == 2 )
        {
            vehicle = createMotor();
        }
        if(type == 3 )
        {
            vehicle = createTruck();
        }
        
        try {
            checkData(vehicle);
        } catch (YearMadeException e) {
        
        System.out.println("Exception occured: " + e.getMessage());
        insert(type);
        }
        this.manager.insertVehicle(vehicle);
    }
    
    public Car createCar()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = Double.valueOf(scanner.nextLine());

        System.out.print("Enter engine type: ");
        String engineType = scanner.nextLine();

        System.out.print("Enter sit: ");
        int sit =Integer.valueOf(scanner.nextLine());    

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter made year: ");
        LocalDate madeYear = LocalDate.parse(scanner.nextLine());
       
        Car car = new Car(id,brand,madeYear,price,color,sit,engineType);
        return car;

    }
    public Truck createTruck()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = Double.valueOf(scanner.nextLine());

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter made year: ");
        LocalDate madeYear = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter weight: ");
        double weight = Double.valueOf(scanner.nextLine());
        Truck truck = new Truck(id,brand,madeYear,price,color,weight);
        return truck;

    }
    public Motor createMotor()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = Double.valueOf(scanner.nextLine());

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter made year: ");
        LocalDate madeYear = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter power: ");
        double power = Double.valueOf(scanner.nextLine());

        Motor motor = new Motor(id,brand,madeYear,price,color,power);
        return motor;

    }
    
    public void performDeleteById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID to deleet: ");
        String id = scanner.nextLine();
        boolean  flag = this.manager.deleteById(id);
        if (flag) {
            System.out.println(" delete successly");
        }
        System.out.println("delete false");
    }

    public void showAllVehicle() {
        this.manager.findAll().forEach(Vehicle::showInformation);
    }
    public void showVehiclebyBrand()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input brand: ");
        String brand = scanner.nextLine();
        System.out.println(this.manager.findByBrand(brand));
    }
    public void showVehiclebyId()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ID: ");
        String brand = scanner.nextLine();
        System.out.println(this.manager.findById(brand));
    }
    public void showVehiclebyColorAndBrand()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Color: ");
        String color = scanner.nextLine();
        System.out.print("Input Brand: ");
        String brand = scanner.nextLine();
        System.out.println(this.manager.findByColorAndBrand(color, brand));
    }
    public void showVehiclebyColor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Color: ");
        String color = scanner.nextLine();
        System.out.println(this.manager.findByColor(color));
    }
    public void showVehiclebyColorAndCar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Color: ");
        String color = scanner.nextLine();
        System.out.println(this.manager.findByColorAndCar(color));
    }
    public void showVehiclebyColorAndTruck()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Color: ");
        String color = scanner.nextLine();
        System.out.println(this.manager.findByColorAndTruck(color));
    }
    public void showVehiclebyColorAndMotor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Color: ");
        String color = scanner.nextLine();
        System.out.println(this.manager.findByColorAndMotor(color));
    }
    private void checkData(Vehicle vehicle) throws YearMadeException {
        ValidatorService.madeYear(vehicle.getMadeYear());
    }

}
