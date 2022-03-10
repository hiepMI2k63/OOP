package bai10;

import java.util.ArrayList;
import java.util.List;

public class QLVanBan {
    public static final char space = ' ';
    public static final char tab = '\t';
    public static final char breack_line = '\n';
    List<VanBan> vanbans ;
    public QLVanBan()
     {
            this.vanbans = new ArrayList<>();
     }
    public void count( String str)
    {
        int letterCount=0,digitCount=0,wordCount=0;

        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))) letterCount++;
            else if(Character.isDigit(str.charAt(i))) digitCount++;                         
        }

        String[] strArr = str.split("\\s",0);
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty()) 
                wordCount++;           //  https://tiendungtcu.wordpress.com/2016/09/12/thuc-hanh-java-bai-20-dem-chu-cai-chu-so-tu-trong-xau/
        }
        System.out.println("So ky tu: "+letterCount);
        System.out.println("So chu so: "+digitCount);
        System.out.println("So tu: "+wordCount);

       // https://tailieu.pro/chuan-hoa-xau-trong-java/#31_Xoa_khoang_trang_thua
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
