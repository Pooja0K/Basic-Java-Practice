package ExceptionHandling;

public class CombinationTryCatchFinallyCase11 {
    public static void main(String[] args) {
      /*  try {
            System.out.println("Try 1");
        }*/
        try {
            System.out.println("Try 2");
        }

        catch (Exception e) {
            System.out.println("Catch 1");
        }

        finally {
            System.out.println("Finally");
        }


        }
    }

//Invalid try2 catch finally makes one set up try1 is left alone
// Output java: 'try' without 'catch', 'finally' or resource declarations
