package String;

public class StringBuffer1 {
    public static void main(String[] args) {
        String s1="Rahul";
        String s2= s1.concat("Varma");
        System.out.println(s1); //value of s1 Rahul did not change
        //System.out.println(s2);// value of s2 is Rahul Varma after concat
        String s5=new String("Saket");
        s5.concat("Singh");
        System.out.println(s5);
        String s6=s5.concat("Singh");
        System.out.println(s6);
       StringBuffer s3= new StringBuffer("Ankita") ;
        s3.append("Sinha");
        System.out.println(s3);
        s3.reverse();
        System.out.println(s3);
        StringBuilder s4= new StringBuilder("Pooja");
        s4.append("Singh");
        System.out.println(s4);
        String s7=s4.toString();
        System.out.println(s7);

    }
}
