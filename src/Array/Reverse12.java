package Array;

public class Reverse12 {

    public static void main(String[] args) {
        int array7 []= {1,2,3,4,5};

          for (int index=array7.length-1; index>=0; index--){
              if(index>0){
                     System.out.print(array7[index]+",");
         }
              else {
                  System.out.print(array7[index]);
              }
          }
        }
    }

