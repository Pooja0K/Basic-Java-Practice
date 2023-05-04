package ExceptionHandling;

public class CombinationTryCatchFinallyCase5 {
    public static void main(String[] args) {
        try {
            System.out.println("Try 1");
        }

        catch (Exception e) {
            System.out.println("Catch 1");
        }

        try {
            System.out.println("Try 2");
        }

        catch (Exception e) {
            System.out.println("Catch 2");
        }
    }
}
//valid
// Output Try 1 //Try 2