package ExceptionHandling;

public class CombinationTryCatchFinallyCase13 {
    public static void main(String[] args) {
        try {
            System.out.println("Try 1");
        }

        catch (Exception e) {
            System.out.println("Catch 1");
        }

        finally {
            System.out.println("Finally 1");
        }

      /* finally {
            System.out.println("Finally 2");
        }*/
    }
}
//Invalid first try catch finally 1 block set but last finally alone cant be without try
// Output D:\Java-Session\src\ExceptionHandling\CombinationTryCatchFinallyCase13.java:17:8
//java: 'finally' without 'try'
