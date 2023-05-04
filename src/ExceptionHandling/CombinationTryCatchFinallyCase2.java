package ExceptionHandling;

public class CombinationTryCatchFinallyCase2 {

    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }
        catch (ArithmeticException e) {
            System.out.println("Catch");
        }
        catch (Exception e) {
            System.out.println("Catch");
        }
    }
}
//valid