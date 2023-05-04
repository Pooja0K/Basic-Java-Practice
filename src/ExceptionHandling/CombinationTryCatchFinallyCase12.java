package ExceptionHandling;

public class CombinationTryCatchFinallyCase12 {
    public static void main(String[] args) {
        try {
            System.out.println("Try 1");
        }

        catch (ArithmeticException e) {
            System.out.println("Catch 1");
        }

        catch (Exception e) {
            System.out.println("Catch 2");
        }

        finally {
            System.out.println("Finally");
        }
    }
}
//valid
//Output Try 1 //Finally

