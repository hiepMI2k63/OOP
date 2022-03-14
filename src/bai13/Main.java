package bai13;

import java.util.Scanner;


import bai13.UI.UIManager;

public class Main {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        UIManager employeeManager = new UIManager();

        while (true) {

            System.out.println("Application");
            System.out.println("Enter 1: To insert employee ");
            System.out.println("Enter 2: To search: ");
            System.out.println("Enter 3: To update: ");
            System.out.println("Enter 4: To delete: ");
            System.out.println("Enter 5: To show all: ");
            System.out.println("Enter 6: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    // Scanner myO = new Scanner(System.in);9800088899/foobar@gmail.com/2000-09-09
                    System.out.println("Enter 1 to insert Fresher");
                    System.out.println("Enter 2: to insert Intern");
                    System.out.println("Enter 3: to insert ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            employeeManager.insert(1,true,"0");
                            break;
                        }
                        case "2": {
                            employeeManager.insert(2,true,"0");
                            break;
                        }
                        case "3": {
                            employeeManager.insert(3,true,"0");
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter 1   Fresher");
                    System.out.println("Enter 2:   Intern");
                    System.out.println("Enter 3:  insert ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            employeeManager.showByType(1);
                            break;
                        }
                        case "2": {
                            employeeManager.showByType(2);
                            break;
                        }
                        case "3": {
                            employeeManager.showByType(3);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "3": {
                    System.out.print("Input ID: ");
                    String updateid = scanner.nextLine();
                   employeeManager.insert(1, false,updateid);
                   break;
               }
                case "4": {
                    System.out.print("Input ID: ");
                    String deleteid = scanner.nextLine();
                        employeeManager.deleteById(deleteid);
                        break;
                }
                case "5": {

                  employeeManager.showAllEmployee();
                  break;
                }
                case "6": {
                        return;
                   // employeeManager.showAllEmployee();
                  }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }
}
