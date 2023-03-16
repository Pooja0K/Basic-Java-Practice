package String;
import java.util.Arrays;
public class CapitalizeFirstLetterInString {
    //Program to convert words with first letter capitalized
    //input {i love my india}
    //output {I Love My India}
    public static void main(String[] args) {
        String s ="i love my india";
        char [] ch =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if((ch[i]=='i') || (ch[i]=='l')|| (ch[i]=='m')){
                System.out.print((String.valueOf(ch[i])).toUpperCase());
            } else  {
                System.out.print((String.valueOf(ch[i])));
            }
        }


    }

}
