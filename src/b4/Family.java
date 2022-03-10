package b4;

import java.util.List;

public class Family {
    static boolean flag = false;
    private List<Person> presons;
    private String address;

    public Family(List<Person> presons, String address) {
        this.presons = presons;
        this.address = address;
    }

    public List<Person> getPresons() {
        return presons;
    }

    public void setPresons(List<Person> presons) {
        this.presons = presons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    // public  void Checkpassportifamily( String passport ) {
            
    //         for (Person person :this.presons) {
    //            if(person.getPassport()== passport)
    //            {
    //               flag = false;               
    //            }
    //         }
   
   // }
    @Override
    public String toString() {
        return "Family{" +
                "presons=" + presons +
                ", address='" + address + '\'' +
                '}';
    }
}
