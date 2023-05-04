package ExceptionHandling;

public class FinallyWithSystemExitMethod {

    public static void main(String[] args) {
        try {
            System.out.println("Try");
            System.exit(0);  //Here JVM is explicitly terminated inside try
        }
        catch (Exception e){

            System.out.println("Catch Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
//In above program try blocked is executed, now when statement System.exit(0);is encountered inside try
// then JVM will not check for finally block other line/statement will not get executed and execution will
//be terminated, therefore Output of the program  is Try
//System.exit(0);--> has highest priority as compared to than Finally
//Here Finally block will not get executed


