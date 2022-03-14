package bai13.Service;

import bai13.Exception.BirthDayException;
import bai13.Exception.EmailException;
import bai13.Exception.FullNameException;
import bai13.Exception.PhoneException;

public class ValidatorService {
    public static void birthdayCheck(String strDate) throws BirthDayException{
        String strDateRegEx = "^(\\d{4})-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$";
        if(strDate.matches(strDateRegEx) == false ){
            throw new BirthDayException("not valid");
        }
        else{
            System.out.println("welcome to vote");
        }
        
    }  
    public static void emailCheck(String strDate) throws EmailException{
        
        String expression = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"; 
        if(strDate.matches(expression)  ){
            throw new EmailException(" don't correct email format");
        }
        else{
            System.out.println("correct email format");
        }
    }  
    public static void fullNameCheck(String strDate) throws FullNameException{
        String expression = "^[a-zA-Z\\s]+"; 
        if(strDate.matches(expression) == false ){
            throw new FullNameException("don't correct full name format");
        }
        else{
            System.out.println("correct full name format");
        }
       
    
        
    }  
    public static void phoneCheck(String strDate) throws PhoneException{
       
        String expression =  "(0/91)?[7-9][0-9]{9}"; 
        if(strDate.matches(expression) == false ){
            throw new PhoneException("don't correct phone number format");
        }
        else{
            System.out.println("correct phone number format");
        }
    }  

}
