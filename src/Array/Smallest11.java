package Array;

import java.util.Arrays;

public class Smallest11 {
    public static void main(String[] args) {
        int a1[] = {4, 3, 9, 7, 2, 4};
        int a2 = a1[0];
        for (int i = 1; i < a1.length; i++) {
            if (a2 > a1[i]) {
                a2 = a1[i];
            }
        }
        System.out.println("Smallest number is: " + a2);
    }
}

