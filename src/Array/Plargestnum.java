package Array;
import java.util.Arrays;

public class Plargestnum {

    public static void main(String[] args) {
        int a1[] = {5, 4, 9, 7, 3, 2};
            for (int i=0; i < a1.length; i++) {
                    for (int j=i+1; j< a1.length; j++) {
                        int temp = 0;
                        if (a1[i] > a1[j]) {
                            temp = a1[i];
                            a1[i] = a1[j];
                            a1[j] = temp;
                        }
                    }
                    System.out.print(a1[i] + " ");

                    }
        //System.out.println();
        System.out.println('\n'+"Smallest number is:" +"" +a1[0]);
        System.out.println("Largest number is:" +"" +a1[a1.length-1]);
            }


        }

