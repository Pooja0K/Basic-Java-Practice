package ExceptionHandling;

public class FinallyCase2 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0); //Risky code
        }
        catch (ArithmeticException e){
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
//In above program exception is raised at line 6 so catch and finally block will get executed
//output is Catch Finally (finally block is executed)
//If there is  exception & it is handled then also finally block is executed