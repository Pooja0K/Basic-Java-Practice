package ExceptionHandling;

public class NestedTryCatchFinally {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block");
        try{
            System.out.println(" Inner Try block"+(10/0)); //Risky code

        }
        catch (ArithmeticException e){
            System.out.println(" Inner Catch block");
        }
        finally {
            System.out.println(" Inner Finally block");
          }
        }
        catch (Exception e){
            System.out.println(" Outer Catch block");
        }
        finally {
            System.out.println(" Outer Finally block");
        }
    }
}
// Outer Try block
// Inner Catch block
// Inner Finally block
// Outer Finally block