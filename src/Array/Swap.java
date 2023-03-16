package Array;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = s1.nextInt(); //20
        System.out.println("Enter Second number");
        int num2 =s1.nextInt(); //40
        num1= (num1+num2); //60;
        num2=(num1-num2);//20
        num1=(num1-num2);//40
        System.out.println("Numbers after swapping are:  "+ num1 +" "+ num2);
    }
}
