package ExceptionHandling;

public class MultipleCatchBlocksCase3 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0); //Risky code
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
       /* catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }*/
    }
}
//we will get compiler error
//java: exception java.lang.ArithmeticException has already been caught

