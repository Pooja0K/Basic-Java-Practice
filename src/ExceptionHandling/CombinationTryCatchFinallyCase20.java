package ExceptionHandling;

public class CombinationTryCatchFinallyCase20 {

    public static void main(String[] args) {
        try {
            System.out.println("Try Outer");
        }
           catch (ArithmeticException e) {
               try {
                   System.out.println("Try Inside Catch");
               }
               catch (ArithmeticException a){
                   System.out.println(" Catch Inside Catch");
               }
            }
        }
    }

//java: variable e is already defined in method main(java.lang.String[])
//to avoid above error we need to chnage exception object e to a
//valid (both catch block handles same type of exception but its nested so fine
//Output: Try Outer //Try Inner
