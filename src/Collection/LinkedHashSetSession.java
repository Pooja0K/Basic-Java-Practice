package Collection;

import java.util.*;

public class LinkedHashSetSession {
    public static void main(String[] args) {
         Set<Integer> lhs= new LinkedHashSet<Integer>();
         //Dynamic polymorphism
        //Object is created for LinkedHashSet
        //It is doubly LinkedHashSet

        lhs.add(1); // add () method is used to insert element to LinkedHashSet
        lhs.add(2);
        lhs.add(4); //adding integer value 4 before 3 to check insertion order is maintained or not
        lhs.add(3);
        System.out.println(lhs);
        //o/p is [1, 2, 4, 3] which means insertion order is maintained in LinkedHashSet
        lhs.add(3); //trying to add duplicate element in line 19 & 20
        lhs.add(4);
        System.out.println(lhs);
        //o/p is [1, 2, 4, 3] which means insertion order is maintained & duplicate value is not allowed

        Set<Character> lhs1= new LinkedHashSet<Character>();
        lhs1.add('e');
        lhs1.add('a');
        lhs1.add('d');
        System.out.println(lhs1);
        //Insertion order is maintained so o/p is [e, a, d]

        List<String> hs=new ArrayList<>();
        hs.add("Apple");
        hs.add("Kiwi");
        hs.add("Mango");
        hs.add("Fig");
        hs.add("Grape");
        hs.add("Mango");
        hs.add("Kiwi");
        System.out.println("Fruit List "+" "+hs);
        //O/P: Fruit Set Fruit List [Apple, Kiwi, Mango, Fig, Grape, Mango, Kiwi]-> insertion order is maintained

        //*****************IMP*INTERVIEW*QUESTION******************************
        //WAP to remove duplicate fruit name but insertion order should be maintained
        //In order to achieve this we can convert List to LinkedHashSet

        Set<String> lhs3= new LinkedHashSet<>(hs);
        //In above line we are converting List to Set
        System.out.println("LinkedHashSet is :"+" "+ lhs3);
        //O/P--> LinkedHashSet is : [Apple, Kiwi, Mango, Fig, Grape]
        //insertion order is maintained but duplicate element is removed





    }
}
