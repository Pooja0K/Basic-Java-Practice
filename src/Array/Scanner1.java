package Array;
import java.util.Scanner;
public class Scanner1 {
    public static void checkEvenNum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
             if (s.nextInt()%2==0){
          System.out.println("This is Even number");
      }
     else{
          System.out.println("This is Odd number");
      }
    }

    public static void main (String[] args) {
        checkEvenNum();

    }
}
