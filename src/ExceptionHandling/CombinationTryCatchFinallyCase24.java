package ExceptionHandling;

public class CombinationTryCatchFinallyCase24 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println("Try Outer");
        }
        catch (ArithmeticException e) {
            System.out.println("Try Outer Catch");
        }
       /* finally
            System.out.println("Try Outer Finally");*/

         }
    }

//Invalid ( finally block does not have curly braces in try catch finally  its mandatory
//Output: java: '{' expected
