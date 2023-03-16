package String;

public class printReverseWord {
    public static void main(String[] args) {
        String str="i love my india";
        String str1 []= str.split(" ");
         //expected output is "aidni ym evol i"
        String newreverse="";
        for(int i=0; i< str1.length;i++) {
            String rev="";
            for(int j=str1.length; j>=0; j--){
                rev=rev+str1[j].charAt(j);
            }
            newreverse=newreverse+rev+"";
        }
        System.out.println(newreverse);
    }
}
