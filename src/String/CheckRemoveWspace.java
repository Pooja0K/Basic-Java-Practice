package String;

public class CheckRemoveWspace {


        public static String checkRemoveWspace(String str) {
            return str.replaceAll(" ","")  ;
        }

    public static void main(String[] args) {
        System.out.println(checkRemoveWspace("How are   you"));
         //String s1="How are   you";
        //System.out.println(s1.replaceAll(" ",""));

        /*
        char ch[]=s1.toCharArray();
        //o/p=HowareYou
        for(int i=0;i<s1.length();i++){
            if(ch[i]!=32){
                System.out.print((String.valueOf(ch[i])));
            }
        }*/


    }
}
