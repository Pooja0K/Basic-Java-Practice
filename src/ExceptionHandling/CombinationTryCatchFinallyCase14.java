package ExceptionHandling;

public class CombinationTryCatchFinallyCase14 {
    public static void main(String[] args) {
       /* try {
            System.out.println("Try 1");
        }*/
        System.out.println("After Try1");

      /*  catch (Exception e) {
            System.out.println("Catch 1");
        }*/
    }
}
//Invalid because there is line --> System.out.println("After Try1"); between try & catch so its
//treated as separate try & catch
//And we cannot have only try or only catch so exception
// Output java: 'try' without 'catch', 'finally' or resource declarations