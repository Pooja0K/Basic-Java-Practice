package String;

import java.util.Arrays;

public class FindVowels {

    public static void main(String[] args) {
        String name ="Pooja";
        char [] ch =name.toCharArray();
        //System.out.println(Arrays.toString(ch));

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u') {
                System.out.print((ch[i])+" ");

            }
        }
    }
}
