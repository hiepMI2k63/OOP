package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTeacher  managerTeacher = new ManagerTeacher ();
        while( true)
        {
            System.out.println("Application Manager Teacher");
            System.out.println("Enter 1: To insert Teacher");
            System.out.println("Enter 2: To find information of techer by id ");
            System.out.println("Enter 2: To delete information of techer by id ");
            System.out.println("Enter 3: To get real salary 1 of techer by id ");
            System.out.println("Enter 4: To exit:");
            String key = scanner.nextLine();
            switch (key) {
                case "1":{
                        System.out.print("Enter age: ");
                        int age = Integer.valueOf(scanner.nextLine());
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter id: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter hometown: ");
                        String hometown = scanner.nextLine();
                        System.out.print("Enter salary: ");
                        Double salary = Double.valueOf(scanner.nextLine());
                        System.out.print("Enter bonus: ");
                        Double bonus = Double.valueOf(scanner.nextLine());
                        System.out.print("Enter penaty: ");
                        Double penaty = Double.valueOf(scanner.nextLine());
                        // System.out.print("Enter real salary: ");
                        // Double realSalary = Double.valueOf(scanner.nextLine());

                        Teacher teacher = new Teacher(salary,bonus,penaty,name,age,hometown,id);
                        managerTeacher.add(teacher);
                          

                        }
                break;
                case "2":{
                    System.out.print("Enter id: ");
                    String id = scanner.nextLine();
                    managerTeacher.findTeacher(id); 
                    System.out.println( managerTeacher.findTeacher(id));
                    break;
                    }
                case "3":{         
                    System.out.print("delete by id: ");
                    String id = scanner.nextLine();
                    System.out.println( managerTeacher.deleteTeacher(id));
                    break;
                }
                case "4":{         
                    System.out.print("get real salary by id: ");
                    String id = scanner.nextLine();
                    System.out.println(managerTeacher.caculationSalary(id));
                    break;
                }
                default:
                    break;
            }
        }
    }
}
