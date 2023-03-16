package String;

import java.util.Arrays;

public class checkAnagram1 {
    public static void main(String[] args) {
        String s1="tea";
        char ch[]=s1.toCharArray();
        Arrays.sort(ch);
        //System.out.println(ch);
        String s2="eati";
        char ch1[]=s2.toCharArray();
        Arrays.sort(ch1);
        //System.out.println(Arrays.equals(ch,ch1));
        boolean flag=false;
        for(int i=0; i<s1.length();i++){
            if(ch[i]==ch1[i])
            {
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag!=false){
            System.out.println("String"+" "+s2+" "+"is Anagram");
        }else
        {
            System.out.println("String"+" "+s2+" "+"is not an Anagram");
        }
    }

}
