package bai11;

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double img;
    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImg() {
        return img;
    }
    public void setImg(double img) {
        this.img = img;
    }
    
    @Override
    public String toString() {
        return "ComplexNumber [img=" + img + ", real=" + real + "]";
    }
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);
 
        temp.real = c1.real + c2.real;// cộng các phần thực
        temp.img = c1.img + c2.img;// cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
    public static ComplexNumber multiplication(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);
 
        temp.real = c1.real*c2.real + c1.img*c2.img;// cộng các phần thực
        temp.img =c1.real*c2.img -  c1.img*c2.real;// cộng các phần ảo
 
        //trả về số phức đầu ra
        return temp;
    }
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
