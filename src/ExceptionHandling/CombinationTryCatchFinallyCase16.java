package ExceptionHandling;

public class CombinationTryCatchFinallyCase16 {
    public static void main(String[] args) {
        try {
            System.out.println("Try 1");
        }

        catch (Exception e) {
            System.out.println("Catch 1");
        }
        System.out.println("After Catch 1");

       /* finally {
            System.out.println("Finally 1");
        }*/
    }
}
//Invalid because there is line --> System.out.println("After Catch1"); between catch & finally
//so finally block is treated as separate block & try & catch as one
//And we cannot have only finally so exception
// Output java: 'finally' without 'try'
