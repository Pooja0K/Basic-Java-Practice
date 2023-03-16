package String;

public class CheckStringtype {
    public static void main(String[] args) {
        String s="We1r@3Gk$&78";
        //excepted 1- only number, 2- only special character,
        //3 only alphabet, 4 or arrange WerGk1378@$&
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                System.out.print(s.charAt(i));
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                System.out.print(s.charAt(i));
            }
            else if (s.charAt(i)>=48 && s.charAt(i)<=57){
                System.out.print(s.charAt(i));
            }
            else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
