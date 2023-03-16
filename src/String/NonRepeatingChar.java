package String;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s="epam systems";
        //Find first non repeating character
       boolean flag = false;
        int j=0;
        for(int i=j+1;i<s.length();i++){
            if(s.charAt(j)==s.charAt(i)){
              flag=true;
            }
            j++;
            }

        System.out.println(s.charAt(j));
    }
}
