package ExceptionHandling;

public class AbnormalTermination2 {
    public static void doMoreStuff(){
            System.out.println("Hello doMoreStuff");
        }
        public static void doStuff(){
            doMoreStuff();
            System.out.println("Hello doStuff");

        }
        public static void main(String[] args) {
            doStuff();
            System.out.println(10/0); //Exception raised here
        }
    }


