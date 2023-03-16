package Array;
import java.util.Arrays;

public class ShiftZerosToLeftInArray {
    //Program to shift zero of array to the first left positions in array
    public static void main(String[] args) {
        int[] a = {2, 3, 0, 0, 5, 0, 8};
        //Shift zeros in array to left so that o/p is {0,0,0,2,3,5,8}
        int[] b = new int[a.length];
        // line 10 is for creating and initializing new array b of same length as array a
        // System.out.println(Arrays.toString(b));
        //Line 12 is to print the new array and see its value after initialization
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
                //System.out.println(count);
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] != 0) {
                b[count] = a[j];
                 //System.out.println(b[count]);
                count++;
            }
        }
        System.out.println(Arrays.toString(b));
    }

}
