package bai11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" number one : ");
        System.out.print("Enter real : ");
        Double real1 = Double.valueOf( scanner.nextLine());
        System.out.print("Enter img: ");
        Double img1 = Double.valueOf( scanner.nextLine());
        System.out.print(" number two : ");
        System.out.print("Enter real : ");
        Double real2 = Double.valueOf( scanner.nextLine());
        System.out.print("Enter img: ");
        Double img2 = Double.valueOf( scanner.nextLine());
        ComplexNumber temp = new ComplexNumber (real1, img1);
        ComplexNumber temp1 = new ComplexNumber (real2,img2);
      
         System.out.println( ComplexNumber.sum(temp, temp1));
         System.out.println( ComplexNumber.multiplication(temp, temp1));
    
    }
}
