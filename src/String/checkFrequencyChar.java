package String;

public class checkFrequencyChar {

    public static int checkFrequency(String str,char ch){
        int count=0;
        String s1=str.toLowerCase();
        for(int i=0;i<s1.length();i++){
            if (s1.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(checkFrequency("ElectricalEngineering",'e'));

    }
}
