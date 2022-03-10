package bai8;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCard managerCard = new ManagerCard();
        while( true)
        {
            System.out.println("Application Manager Teacher");
            System.out.println("Enter 1: To insert Card");
            System.out.println("Enter 2: To show all card  ");
            System.out.println("Enter 3: To delete  card by id ");
            System.out.println("Enter 4: To exit:");
            String key = scanner.nextLine();
            switch (key) {
                case "1":{
                        System.out.print("Enter  borrow date : ");
                        String borrow = scanner.nextLine();
                        LocalDate borrowDate = LocalDate.parse(borrow);
                        System.out.print("Enter  payment date : ");
                        String payment = scanner.nextLine();
                        LocalDate paymentDate = LocalDate.parse(payment);
                        System.out.print("Enter book id: ");
                        String BookId = scanner.nextLine();
                        System.out.print("Enter Card id: ");
                        String CardId = scanner.nextLine();
                        System.out.print("Enter student's name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student's class: ");
                        String StudentClass = scanner.nextLine();
                        System.out.print("Enter age: ");
                        Integer age = Integer.valueOf( scanner.nextLine());
                        Student student = new Student(name,StudentClass,age);
                        Card card = new Card(student,CardId,borrowDate,paymentDate,BookId);
                        managerCard.add(card);

                        }
                break;
                case "2":{
                   
                   managerCard.showAll();
                   
                    break;
                    }
                case "3":{         
                    System.out.print("delete by id: ");
                    String id = scanner.nextLine();
                    Boolean a =  managerCard.deleteCard(id);
                    System.out.println( a);
                    break;
                }
               
                default:
                    break;
            }
        }
    }
    
}
