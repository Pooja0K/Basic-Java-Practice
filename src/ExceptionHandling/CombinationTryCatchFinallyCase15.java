package ExceptionHandling;

public class CombinationTryCatchFinallyCase15 {
    public static void main(String[] args) {
          try {
                System.out.println("Try 1");
            }

            catch (ArithmeticException e) {
                System.out.println("Catch 1");
            }
          System.out.println("After Try 1");

           /* catch (Exception e) {
                System.out.println("Catch 2");
            }*/
        }
    }
//Invalid because there is line --> System.out.println("After Try1"); between catch1 & catch2 so its
//treated as separate try catch1 block  & catch2 as alone without try
//And we cannot have  or only catch so exception
// Output java: java: 'catch' without 'try'



