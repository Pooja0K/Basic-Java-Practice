package Array;

public class PairSum6 {
    //program to print pairs in array whose sum is 6
    public static void main(String[] args) {
        int[] a1 = {2, 1, 3, 4, -7, 5, 13, 8, -2};
        //Print pair whose sum is 6
        //op{2-->4 1-->5  -7-->13  8-->-2 }

        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] + a1[j] == 6) {
                    System.out.println(a1[i] + "-->" + a1[j]);
                }
            }

        }

    }
}
