package String;

public class checkAnagram2 {
    public static void main(String[] args) {
        String s1="tea";
        String s2="eai";
        boolean flag =true;
        for(int i=0;i<s1.length();i++){
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)!=s2.charAt(j)){
                   flag=false;
                   break;
                }
            }
        }
        System.out.println(s1+" "+"and"+" "+s2+" "+"are not Anagram");
    }

}
