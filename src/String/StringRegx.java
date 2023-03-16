package String;

import java.util.Locale;

public class StringRegx {
    public static void main(String[] args) {
        String regex=".*[aeiou].*";
        String ss="Pooja";
        String ss1 =ss.toLowerCase();

        char [] ch=ss.toCharArray();
        int count=0;
        boolean flag =true;
        for (int i=0; i<ss1.length();i++) {
            if (String.valueOf(ss1.charAt(i)).matches(regex)) {
                //character needs to be converted to String and then use string function matches
                count ++;
                System.out.println("count : "+count);
                System.out.println("abc");
            }
        }

    }
}
