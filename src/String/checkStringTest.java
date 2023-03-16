package String;

public class checkStringTest {
    public static void main(String[] args) {
        String s="HelloHowAreYouWelcome";
        String s2="";
        //o/p-H_elloH_owA_reY_ouW_elcome
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                s2=s2+s.charAt(i)+"_";
            }
            else {
               s2= s2+s.charAt(i);
            }
        }
        System.out.print(s2);
    }
}
