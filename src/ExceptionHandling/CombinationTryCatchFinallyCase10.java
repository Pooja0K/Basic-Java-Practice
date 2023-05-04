package ExceptionHandling;

public class CombinationTryCatchFinallyCase10 {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        }
        finally {
            System.out.println("Finally");
        }
      /*  catch (Exception e) {
            System.out.println("Catch");
        }*/
    }
}
//Invalid (try finally one pair but catch left alone as it is after finally
// Output java: 'catch' without 'try'
