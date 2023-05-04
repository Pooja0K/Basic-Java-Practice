package ExceptionHandling;

public class AbnormalTermination1 {
    public static void doMoreStuff(){
        System.out.println("Hello doMoreStuff");
            }
    public static void doStuff(){
        doMoreStuff();
        System.out.println("Hello doStuff");
        System.out.println(10/0); //Exception raised here
    }
    public static void main(String[] args) {
        doStuff();
    }
}
