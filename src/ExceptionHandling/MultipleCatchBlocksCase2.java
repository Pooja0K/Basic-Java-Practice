package ExceptionHandling;

public class MultipleCatchBlocksCase2 {

    public static void main(String[] args) {
        try {
            System.out.println(10/0); //Risky code

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
//No Error it will execute successfully

