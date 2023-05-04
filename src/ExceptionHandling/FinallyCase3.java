package ExceptionHandling;

import java.io.IOException;

public class FinallyCase3 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0); //Risky code
        }
        catch (NullPointerException e){
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
//In above program exception is raised at line 6
// Catch block does not handle ArithmeticException so it won't get executed
// But finally block will get executed
// So output is Finally followed by abnormal termination so exception message
//If there is  exception raised but not handled then also finally block is executed

