package Array;

import java.lang.reflect.Array;

public class ArrDesc {

    public static void main(String[] args) {

        int a11 []={5,3,8,1,9,7,2,4};
         for (int i=0;  i<a11.length; i++) {
           int temp;
            for (int j=i+1; j<a11.length; j++) {

                if (a11[i]<a11[j]) {
                    temp=a11[i];
                    a11[i]=a11[j];
                    a11[j]=temp;

                }

                }
             System.out.print(a11[i]+" ");
        }

    }
}
