package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class Certification{

    
    protected String id;
    protected String ce;
    protected String ce1;
   

    public Certification(String id, String ce, String ce1) {
        this.id = id;
        this.ce = ce;
        this.ce1 = ce1;
    }


    @Override
    public String toString() {
        return "Certification [ce=" + ce + ", ce1=" + ce1 + ", id=" + id + "]";
    }

}

public class tewww {

    
    protected String id;

    protected List<Certification> certificates;

    public tewww(String id, List<Certification> certificates) {
        this.id = id;
        this.certificates = certificates;
    }
  


    
    @Override
    public String toString() {
        return "tewww [certificates=" + certificates + ", id=" + id + "]";
    }




    public static void main(String[] args) {
        List<Certification> certificationsObject = new ArrayList<>();

        Certification foo = new Certification("1","1","1");
        Certification foo2 = new Certification("2","2","2");
        Certification foo1 = new Certification("3","3","3");
        certificationsObject.add(foo);
        certificationsObject.add(foo1);
        certificationsObject.add(foo2);

         List<tewww> test = new ArrayList<>();
         tewww t1 = new tewww("t1",certificationsObject);
       // tewww t1 = new tewww("t1",certificationsObject);
       test.add(t1);
        System.out.println(t1);
       
        // test.add(t1);
        // List<tewww> s = test.stream()
        //  .filter(employee -> employee instanceof tewww)
        //  .collect(Collectors.toList());
        // System.out.println(certificationsObject);
        // for (tewww tewww : test) {
        //     System.out.println(tewww);
        // }
    }
    
}
