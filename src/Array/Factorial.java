package Array;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number :");
         int num =s.nextInt();
        int i=1; int fact=num;
        while(i<num)
         {
             fact=fact*i;
            i++;
            }
        System.out.println("Factorial of " +num+ " is:" +fact);


    }
}
