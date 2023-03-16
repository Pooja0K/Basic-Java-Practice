package String;
import java.util.Arrays;
public class CapitalFirst {
    //Program to convert words with first letter capitalized
    //input {i love my india}
    //output {I Love My India}
    public static void main(String[] args) {
        String s ="i love my india";
        System.out.println(s);
        String ss[]=s.split(" ");
        for(int i=0;i<ss.length;i++){
            String a= ss[i].substring(0,1).toUpperCase()+ss[i].substring(1);
                System.out.print(a);
            }
        }
    }

