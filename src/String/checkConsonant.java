/*
package String;*/
package String;

import java.util.Arrays;

public class checkConsonant {

    public static String checkConsonants(String str){
        //System.out.println(str);
        String s2=str.toLowerCase();
        char ch[]=s2.toCharArray();
       for (int i=0;i<s2.length();i++) {
           if(ch[i]!='a'||ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u'){
               System.out.print(ch[i]);
           }
       }
       return ch.toString();
    }

    public static void main(String[] args) {
        checkConsonants("Pooja");

    }
}


