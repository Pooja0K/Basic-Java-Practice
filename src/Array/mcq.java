package Array;
import java.util.*;

public class mcq {
        public static void main(String args[])
        {
            short x = 10;
            x = (short) (x * 5);
            System.out.print(x);
            System.out.println(x);

            int array[] = new int [5];
            for (int i = 5; i > 0; i--)
                array[5-i] = i;
            Arrays.fill(array, 1, 4, 8);
            for (int i = 0; i < 5 ; i++)
                System.out.print(array[i]);
        }
    }