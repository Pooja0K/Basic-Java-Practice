package String;

public class checkAnagram {
    public static void main(String[] args) {
        String s1="tea";
        String s2="eat";
        boolean flag=true;
        for(int i=0; i<s1.length();i++){
            if(s2.indexOf(s1.charAt(i))==-1)
            {
                flag=false;
            }
        }
        if(flag){
            System.out.println("String"+" "+s2+" "+"is Anagram");
        }else
        {
            System.out.println("String"+" "+s2+" "+"is not an Anagram");
        }
    }

}
