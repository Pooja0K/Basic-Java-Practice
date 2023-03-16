package Array;

public class Largest11 {

    public static void main(String[] args) {
        int a1[] = {12, 3, 9, 7, 2, 1};
        int a2 = a1[0];
        for (int i = 1; i < a1.length; i++) {
            if (a2 < a1[i]) {
                a2 = a1[i];
            }
        }
        System.out.println("Largest number is: "+ a2);
    }
}
