package b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This is sudo code. To overview how to do it.
// You can finish by fill you code

public class Main {
    static int n = 5;
    public static void main(String[] args) {


        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            
            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();
       
            List<Person> persons = new ArrayList<>();
            System.out.println("Enter number person");

            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {

                Person person = null;
                Scanner scanner1 = new Scanner(System.in);
                

                for (int k = 5; k > 0; k--) {

                    System.out.print("1.Input passport: ");
                    String passport = scanner1.nextLine();
                    for (Person attendee : persons) {
                        if ( passport == attendee.getPassport()) {
                            System.out.print("2. nhap lai Input passport: ");                          
                        }
                                               
                    }
                 person   = new Person("name",12,"job",passport);
                }              
                persons.add(person);             
            }          
            town.addFamily(new Family(persons,address ));
           
        }
    }
}
