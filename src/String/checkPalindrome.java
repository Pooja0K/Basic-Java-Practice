package String;

import java.util.Arrays;

public class checkPalindrome {
    public static void main(String[] args) {
        String s = "naman";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev=rev+s.charAt(i);
        }
        //System.out.println(rev);
        if (rev.equals(s)) {
            System.out.println("String" + " " + rev + " " + "is palindrome");
        } else {
            System.out.println("String" + " " + rev + " " + "is not a palindrome");
        }
    }
}

