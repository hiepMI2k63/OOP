package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        while( true)
        {
            System.out.println("Application Manager School");
            System.out.println("Enter 1: To insert student");
            System.out.println("Enter 2: To show information of students (age = 20): ");
            System.out.println("Enter 2: To show number of students (age = 23 & provent = DN): ");
            System.out.println("Enter 4: To exit:");
            String key = scanner.nextLine();
            switch (key) {
                case "1":{
                        System.out.print("Enter age: ");
                        int age = Integer.valueOf(scanner.nextLine());
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter hometown: ");
                        String hometown = scanner.nextLine();
                        System.out.print("Enter class student: ");
                        int classStudent = Integer.valueOf(scanner.nextLine());
                        Student student = new Student(name, age, hometown, classStudent);
                            school.add(student);
                            System.out.println(student.getAge());

                        }
                break;
                case "2":{
                        for (Student pStudent :  school.getStudent20YearOld()) {
                                System.out.println(pStudent);
                        }
                        
                    }
                case "3":{
            
                      System.out.println( school.countStudent23YearOldInQ());     
                    break;
                }
                case "4":{
               
                  return;
              }
                default:
                    break;
            }
        }
   
    }
   
}
