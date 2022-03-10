package test;
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
    super(s);
    }
    }
class CustomExceptionExample {

    static void validate(int age) throws InvalidAgeException {
        
    if (age < 18) {
    throw new InvalidAgeException("not valid");

    } else {

    System.out.println("welcome to vote");

    }
    }

public class test {
   
    public static void main(String args[]) {
        try {
        validate(13);
        } catch (Exception m) {

        System.out.println("Exception occured: " + m.getMessage());

        }
        
        System.out.println("rest of the cod");

        }
        }
}
