package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        System.out.println("This is main method");
        PrintWriter pw= new PrintWriter("test.txt");
        System.out.println("Print pw");
        pw.println("This is PrintWriter class and it will throw unchecked exception if not handled");

        System.out.println("::::::::::::::::::::");
        Thread.sleep(1000);    }

}
//we will compile time error if not handled
// java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown: line-9:25
//java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown-line 14:21