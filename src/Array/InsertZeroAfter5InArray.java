package Array;

import java.util.Arrays;

public class InsertZeroAfter5InArray {
    //Program to insert one Zero after 5 everytime it appears in Array
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 4, 5, 2, 5}; //7
        // Expected output is {3,5,0,6,4,5,0,2,5,0}
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5) {
                count++;
            }
        }
        int[] b = new int[a.length + count]; //10
        int k = 0 ;
        if (k<b.length) {
            for (int j = 0; j < a.length; j++) {
                if (a[j]!= 5) {
                    b[k] = a[j];
                    //System.out.println(b[k]);
                    k++;
                }
               else if (a[j] == 5) {
                    b[k] = a[j];
                    k++;
                    b[k]=0;
                    //System.out.println(b[k]);
                    k++;
                }

            }
            System.out.println(Arrays.toString(b));


        }
    }
}


