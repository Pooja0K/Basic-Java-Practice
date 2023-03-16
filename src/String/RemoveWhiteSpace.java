package String;

import java.util.Arrays;
public class RemoveWhiteSpace {
    //12.Program to remove whitespaces from String without using replace or replace All
    //input {i love my india}
    //output {ilovemyindia}
    public static void main(String[] args) {
        String s ="i love my india";
        char [] ch =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]!=' '){
                System.out.print((String.valueOf(ch[i])));
            }
        }
    }
}
