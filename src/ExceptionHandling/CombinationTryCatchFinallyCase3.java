package ExceptionHandling;

public class CombinationTryCatchFinallyCase3 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }

        catch (Exception e) {
            System.out.println("Catch");
        }

       /* catch (ArithmeticException e) {
            System.out.println("Catch");
        }*/
    }
}
//java: exception java.lang.ArithmeticException has already been caught