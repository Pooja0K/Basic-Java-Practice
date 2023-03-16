package Array;

public class PrintArray1 {
  public static void printArray1() {

    int arr [] = {2,5,9,4,12,6,9};

        for (int i = 0; i < arr.length; i++)
        {
           if(arr[i]%2==0){

            System.out.println(arr[i]);

            }
        }
  }


  public static void main (String[] args) {
    printArray1();
    /*  int array2 []= {1,2,3,4,5};
      for (int index=0; index <array2.length; index++){
          if (index < 4 )
          {
              System.out.print(array2[index] +",");
          }
          else {
              System.out.print(array2[index]);
          }*/
  }



}

