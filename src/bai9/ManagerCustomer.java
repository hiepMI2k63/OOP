package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    private List<Customer>  custumers;
    public ManagerCustomer()
    {
        this.custumers =  new ArrayList<>();
    }
    public void add( Customer e)
    {
        this.custumers.add(e);
    }
    public boolean delete(String codemeter)
    {
        Customer customer =  this.custumers.stream().filter( cus -> cus.getMeterCode().equals(codemeter)).findFirst().orElse(null);
        if (customer != null) {
            this.custumers.remove(customer);
            return true;
        }
        return false;
    }
    public boolean modifier(String codemeter)
    {
        Customer customer =  this.custumers.stream().filter( cus -> cus.getMeterCode().equals(codemeter)).findFirst().orElse(null);
        if (customer != null) {
            try (Scanner scanner = new Scanner(System.in)) {
                String temp = customer.getMeterCode();
                System.out.println("Enter address:");
                scanner.nextLine();
                String address = scanner.nextLine();
                System.out.println("Enter name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                
                this.custumers.remove(customer);
                Customer cusObject = new Customer(name,temp,address);
                this.custumers.add(cusObject);
            }
            return true;
        }
        return false;
    }

   
}
