package ExceptionHandling;

public class CombinationTryCatchFinallyCase17 {

    public static void main(String[] args) {
        try {
            System.out.println("Try Outer");
            try {
                System.out.println("Try Inner");
            } catch (ArithmeticException e) {
                System.out.println(" Catch Inner");
            }
        }catch (Exception e){
                System.out.println(" Catch Outer");
            }
        }
}

//valid
//Output: Try Outer //Try Inner


