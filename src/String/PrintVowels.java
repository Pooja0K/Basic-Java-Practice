package String;

public class PrintVowels {
    public static void main(String[] args) {
        char [] myarray={'P','o','o','j','a','p'};
        // expected output is {o,o,a}
        for(int i=0;i< myarray.length;i++){
            if(myarray[i]=='a' || myarray[i]=='e' || myarray[i]=='i' || myarray[i]=='o' || myarray[i]=='u'){
                System.out.println(myarray[i]);
            }
        }
    }

}
