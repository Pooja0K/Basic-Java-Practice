package Collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSession {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList();
        ////Homogeneous LinkedList is created using above statement having Generics String
        ll.add("Laptop");
        ll.add("Ernst");
        ll.add("Young");
        //System.out.println(ll);
        ll.add(2,"&");
        //System.out.println(ll);
        ll.addFirst("Session");
        //System.out.println(ll);
        ll.addLast("Practice");
        //System.out.println(ll);
        //System.out.println(ll.indexOf("Young"));
        //System.out.println(ll.remove());// it removes 0th element from list
        //System.out.println(ll);
        //System.out.println(ll.remove("&"));  // returns true
        //System.out.println(ll);
        //System.out.println(ll.remove(3));
        //System.out.println(ll);
        //System.out.println(ll.removeFirst());
        //System.out.println(ll);
        //System.out.println(ll.removeLast());
        //System.out.println(ll);
        ll.add(5,"&");
        System.out.println(ll);
       // System.out.println(ll.removeFirstOccurrence("&"));
        //System.out.println(ll);
        //System.out.println(ll.removeLastOccurrence("&"));
        //System.out.println(ll);
       // System.out.println(ll.contains("&"));
        ll.addFirst("2ndMarch2023");
        //System.out.println(ll);
        ll.addLast("Over");
        //System.out.println(ll);
        //System.out.println(ll.size());
       //ll.sort(Comparator.reverseOrder());
       // System.out.println(ll);
       //ll.sort(Comparator.naturalOrder());
        //System.out.println(ll);







    }
}
