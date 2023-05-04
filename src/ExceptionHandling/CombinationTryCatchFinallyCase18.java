package ExceptionHandling;

public class CombinationTryCatchFinallyCase18 {

    public static void main(String[] args) {
        try {
            System.out.println("Try Outer");
            try {
                System.out.println("Try Inner");
            } catch (ArithmeticException e) {
                System.out.println(" Catch Inner");
            }
        }catch (ArithmeticException e){
            System.out.println(" Catch Outer");
        }
    }
}

//valid (both catch block handles same type of exception but its nested so fine
//Output: Try Outer //Try Inner
