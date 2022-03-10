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
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    Scanner myO = new Scanner(System.in);
                    System.out.println("Enter 1 to insert Fresher");
                    System.out.println("Enter 2: to insert Intern");
                    System.out.println("Enter 3: to insert ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "1": {
                            employeeManager.insert(1);
                            break;
                        }
                        case "2": {
                            employeeManager.insert(2);
                            break;
                        }
                        case "3": {
                            employeeManager.insert(3);
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }

                case "2": {
                   // employeeManager.showAllInformation();
                    break;
                }

                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
