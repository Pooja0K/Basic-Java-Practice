package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListHetroSession {
    public static void main(String[] args) {
        ArrayList<Object> al=new ArrayList();
        //Heterogeneous ArrayList is created using above statement having Generics Object
        al.add("Ankita"); //this will add String Ankita at 0th position in ArrayList
        al.add('c'); //this will add char c at 1st position in ArrayList
        al.add(5); //this will add integer data type 5 at 2nd position in ArrayList
        System.out.println(al);
        al.add(2,10.5);
        System.out.println(al); //this will add float 10.5 at 2nd Position in ArrayList
        // and shift every other elements by +1 position starting from pos 2 onwards
        System.out.println(al.size());
        System.out.println(al.contains('c'));
        System.out.println(al.indexOf(5));
        System.out.println( al.set(0,"Pooja"));
        System.out.println(al);
        System.out.println(al.isEmpty());
        //System.out.println(al.remove(10.5));
        //System.out.println(al);
        //System.out.println(al.removeAll(al));
        //System.out.println(al);
        System.out.println(al.get(0));
        al.add(4,'c');
        System.out.println(al);
        System.out.println(al.lastIndexOf('c'));
        System.out.println(al.subList(2,4));
        //System.out.println(al.addAll(2,al));
        //System.out.println(al);
        ArrayList<Object> al2 = (ArrayList<Object>) al.clone();
        // need to understand this line typecast needed why?'
        System.out.println(al2);


    }
}
