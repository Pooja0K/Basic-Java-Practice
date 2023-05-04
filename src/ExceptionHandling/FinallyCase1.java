package ExceptionHandling;

public class FinallyCase1 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }
        catch (Exception e){
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
//In above program no exception is raised so try and finally block will get executed
//output is Try Finally
//If there is no exception then finally block is executed