package ExceptionHandling;

public class ThreeMethodsToPrintException {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0); //Risky code
            }
        catch (ArithmeticException e) {
            //e.printStackTrace();
            //System.out.println(e);
            //System.out.println(e.toString());
            System.out.println(e.getMessage());

        }
    }
}