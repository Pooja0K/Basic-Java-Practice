package Array;

public class PrimeNumber {

    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6,15,25,49,11};
        for (int i = 0; i < a1.length; i++) {
            boolean flag=true;
            for (int j = 2; j < a1[i]; j++) {
                if (a1[i] % j == 0) {
                   flag=false;
                    break;
                     }
                   }
                  if(flag)
                      System.out.println("prime numbers are:"+" "+a1[i]);

               }
    }

}