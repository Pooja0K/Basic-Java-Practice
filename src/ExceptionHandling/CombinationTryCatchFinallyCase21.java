package ExceptionHandling;

public class CombinationTryCatchFinallyCase21 {
    public static void main(String[] args) {
        try {
            System.out.println("Try Outer");
        }
        catch (ArithmeticException e) {
            System.out.println("Try Outer Catch");
        }
        finally {
            try {
                System.out.println("Try Inside Finally");
            }
            catch (ArithmeticException a){
                System.out.println(" Catch Inside Finally");
            }
            finally {
                System.out.println(" Finally Inside Finally");
            }
        }
    }
}

//valid (both catch block handles same type of exception but its nested so fine
//Output: Try Outer //Try Inside Finally //Finally Inside Finally



