package bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        QLVanBan qlvan = new QLVanBan();
        qlvan.count(str);
    }

}
