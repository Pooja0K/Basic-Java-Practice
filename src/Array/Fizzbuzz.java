package Array;

public class Fizzbuzz {
    public static void main(String[] args) {
        int arr8[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15};
        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] % 3 == 0 && arr8[i] % 5 == 0) {
                System.out.println(arr8[i] + " " + "fizzbuzz");
            } else if (arr8[i] % 3 == 0) {
                System.out.println(arr8[i] + " " + "fizz");

            } else if (arr8[i] % 5 == 0) {

                System.out.println(arr8[i] + " " + "buzz");
            }
        }
    }
}

