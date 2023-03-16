package Array;

public class Duplicate {
    //program to print duplicate numbers only from array
    public static void main(String[] args) {
        int[] a1 = {1, 3, 1, 9, 3, 4, 2, 4};
        //print duplicate numbers 1 3 4
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j]) {
                    System.out.print(a1[j] + " ");
                }

            }
        }
    }
}

