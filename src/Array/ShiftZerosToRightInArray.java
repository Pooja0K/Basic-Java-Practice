package Array;

import java.util.Arrays;

public class ShiftZerosToRightInArray {
    //Program to shift zero values of array to the last right positions
    public static void main(String[] args) {
        int[] a = {2, 3, 0, 0, 5, 0, 8};
        //Shift zeros in array to right so that o/p is {2,3,5,8,0,0,0}
        int[] b = new int[a.length];
        // line 10 is for creating and initializing new array b of same length as array a
        // System.out.println(Arrays.toString(b));
        //Line 12 is to print the new array and see its value after initialization
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[j] = a[i];
                // System.out.println(b[j]);
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
