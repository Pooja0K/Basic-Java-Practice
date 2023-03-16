package String;
public class printReverseString {
    public static void main(String[] args) {
        String str = "i love my india";
        //expected output is "aidni ym evol i"
        String rev = "";
        String str3="";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev =rev+str.charAt(i);

            }

                System.out.print(rev);


            }
    }

