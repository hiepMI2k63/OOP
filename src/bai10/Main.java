package bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int letterCount=0,digitCount=0,wordCount=0;

        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))) letterCount++;
            else if(Character.isDigit(str.charAt(i))) digitCount++;                         
        }

        String[] strArr = str.split("\\s",0);
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty()) 
                wordCount++;         
        }
        System.out.println("So ky tu: "+letterCount);
        System.out.println("So chu so: "+digitCount);
        System.out.println("So tu: "+wordCount);

      
            str=str.trim() ;
                    str = str.replaceAll("\\s+", " ");
                    System.out.println("So tu: "+str);
        int  count = 0;
                    for (int i = 0; i < str.length(); i++) {

                        // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
                        if (str.charAt(i) == 'a' ||str.charAt(i) == 'A' ) {
                            count++;
                        }
                    }
                    System.out.println("So ký tự a or A: " + count);
    }

}
