package String;

public class checkPalindrome1 {
    public static void main(String[] args) {
        String s = "naman";
        char ch[] = s.toCharArray();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + String.valueOf(ch[i]);
        }
        //System.out.println(rev);
        if (rev.equals(s)) {
            System.out.println("String" + " " + rev + " " + "is palindrome");
        } else {
            System.out.println("String" + " " + rev + " " + "is not a palindrome");
        }
    }


}
