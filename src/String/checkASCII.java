package String;

public class checkASCII {
    public static void main(String[] args) {
        char [] myarray={'P','o','o','j','a','p'};

        char a='p';
        int d = a;
        System.out.println(d);
        //expected outcome is {o,o,j}
        for(int i=0;i< myarray.length;i++){
            if(myarray[i]!=112 || myarray[i]=='e' ||myarray[i]=='i' ||myarray[i]=='o' ||myarray[i]=='u') {

                System.out.println();
            }
        }
        }
    }

