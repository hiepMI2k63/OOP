package test;
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
    super(s);
    }
    }
class CustomExceptionExample {

    static void validateDate(String strDate) throws InvalidAgeException{
        
        String strDateRegEx = "^(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
        
        if(strDate.matches(strDateRegEx) == false){
            throw new InvalidAgeException("not valid");
        }else{
            System.out.println("welcome to vote");
        }
        
    }   

public class test {
   
    public static void main(String args[]) {
        String[] strDates = {
            "2018-31",
            "201a-12",
            "20011",
            "2022-06-13",
            "2022-13-06",
            "2009-5",
            "2028"
    };
    
    for(String strDate : strDates){
      
        try {
             validateDate(strDate);
        } catch (Exception m) {

        System.out.println("Exception occured: " + m.getMessage());

        }
    }

        
        
 

        }
        }
}
