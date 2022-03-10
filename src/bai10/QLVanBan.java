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
    public int count( String str)
    {
        if (str == null) {
            return 0;
        }
        int count = 0;
        int size = str.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != space && str.charAt(i) != tab 
                    && str.charAt(i) != breack_line) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
       

    }
}
