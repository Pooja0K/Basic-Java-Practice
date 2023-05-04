package ExceptionHandling;

public class FinallyWithReturnCase1 {

    public static void main(String[] args) {
        try {
            System.out.println("Try");
            return; //return is called here
        }
        catch (Exception e){

            System.out.println("Catch Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
//In above program try blocked is executed, now when return statement is encountered inside try
// then JVM will check if there is any finally block or not for above class, if finally block is present
// then finally block will be executed first and after that only return statement will be executed
// Therefore Output of the program  is Try Finally



