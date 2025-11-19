import java.util.Scanner;

class CustomException extends Exception {
    CustomException(String mgs) {
        super(mgs);
    }
}

public class UserDefinedException {
    static void checkAge(int age) throws CustomException{
        // throws: Declares exceptions that a method may throw
        if(age < 18){
            throw new CustomException("Not eligible for vote...");
            // throw: Used to explicitly throw an exception
        }
        else{
            System.out.println("Ready to give vote...");
        }
    }
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            checkAge(age);
            /*
             * Cannot make a static reference to the non-static 
             * method checkAge(int) from the type UserDefinedExceptionJava(603979977)
             */
        } catch (CustomException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
