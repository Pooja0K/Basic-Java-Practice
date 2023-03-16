package Array;
import java.util.Arrays;

public class tryarray5 {
        //Program to insert one Zero after 5 everytime it appears in Array
        public static void main(String[] args) {
            int[] a = {3, 5, 6, 4, 5, 2, 5};
            // Expected output is {3,5,0,6,4,5,0,2,5,0}
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 5) {
                    count++;
                }
                // System.out.println(count);
            }
            int[] b = new int[a.length + count];
            //System.out.println(Arrays.toString(b));
             for (int j = 0; j < a.length; j++) {

                 for (int k=0;  k<b.length;k++)
                 {
                     if (a[j] != 5) {
                         b[k] = a[j];
                     }
                     if (a[j] == 5) {
                         b[k] = a[j];
                         b[k + 1] = 0;
                         System.out.println(b[k]);
                     }
                 }


            }

        }
    }



