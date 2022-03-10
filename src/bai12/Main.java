package bai12;

import java.util.Scanner;

import bai12.UI.UIVehicle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         UIVehicle uivehicle = new UIVehicle();
        while( true)
        {
            System.out.println("Application Manager Vehicle");
            System.out.println("Enter 1: To insert vehicle");
            System.out.println("Enter 2: To find information of vehicle  ");
            System.out.println("Enter 3: To delete information of techer by id ");
            System.out.println("Enter 4: To show all ");
            System.out.println("Enter 5: To exit:");
            String key = scanner.nextLine();
            switch (key) {
                case "1":{
                    // Scanner myO = new Scanner(System.in);
                    System.out.println("Enter 1: to insert Car");
                    System.out.println("Enter 2: to insert Motor");
                    System.out.println("Enter 3: to insert Truck ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                                uivehicle.insert(1);
                            break;
                        }
                        case "2": {
                            uivehicle.insert(2);
                            break;
                        }
                        case "3": {
                            uivehicle.insert(3);
                            break;
                        }
                        default:
                            break;
                    }   
                    break;                
                        }
                    
                case "2":{
                    // Scanner myO = new Scanner(System.in);
                    System.out.println("Enter 1: to find id");
                    System.out.println("Enter 2: to find brand");
                    System.out.println("Enter 3: to find color ");
                    System.out.println("Enter 4: to find color and band ");
                   
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                          uivehicle.showVehiclebyId();
                            
                            break;
                        }
                        case "2": {
                            uivehicle.showVehiclebyBrand();
                            break;
                        }
                        case "3": {
                            System.out.println("Enter 1: to find color and Car");
                            System.out.println("Enter 2: to find color and Truck");
                            System.out.println("Enter 3: to find color and Motor ");
                            System.out.println("Enter 4: to find all ");
                            System.out.println("Enter 5: exit program ");                           
                            String key1 = scanner.nextLine();
                            switch (key1) {
                                case "1":{
                                    uivehicle.showVehiclebyColorAndCar();
                                    break;
                                }
                                case "2":{
                                    uivehicle.showVehiclebyColorAndTruck();
                                    break;
                                }
                                case "3":{
                                    uivehicle.showVehiclebyColorAndMotor();
                                    break;
                                }
                                case "4":{
                                    uivehicle.showVehiclebyColor();
                                    break;
                                }
                                case "5":{
                                    return;
                                }
                                default:
                                    break;
                            }
                            break;
                        }
                        case "4": {
                            uivehicle.showVehiclebyColorAndBrand();
                            break;
                        }
                        default:
                            break;
                    } 
                    break;
                    }
                case "3":{         
                    System.out.println(" delete:");
                    uivehicle.performDeleteById();
                    break;
                }
                case "4":{     
                    System.out.println("show all ");
                    uivehicle.showAllVehicle();    
                    break;
                }
                case "5":
                {
                    return;
                }
                default:
                    break;
            }
        }
    
    }
}
