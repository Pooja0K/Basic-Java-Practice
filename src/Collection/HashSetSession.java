package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetSession {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>(); //Dynamic polymorphism
        //Above line creates object of Hashset & it is modifiable as we are using new keyword here
       /* HashSet<Integer> hs=new HashSet<>();*/
        //Above line creates object of Hashset class & is modifiable
        set.add(1); // adding integer elements to Set
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(4);
        // In line 17, trying to add duplicate value in Set , but set will not insert/add duplicate value
        //Hence when line 19 will be executed outcome will still be [1, 2, 3, 4]
        System.out.println(set);
        //output is [1, 2, 3, 4], here insertion order is not maintained
        //Even though we have added 4 to set before 3 but still (3 came before 4 in the o/p set)
        //It's because insertion order is not maintained in set
        //Elements gets added in order based on the hashcode/Ascii value of each element in set

        //To understand Insertion order in set better we will take example of Character
        HashSet<Character> hs=new HashSet<>();
        hs.add('e');
        hs.add('a');
        hs.add('u');
        System.out.println(hs);
        //output is [a, e, u], so it's not stored based on insertion order rather on ascii/hashcode value

        //To understand Insertion order in set better we will take one more example of String
        HashSet<String> hs1=new HashSet<>();
        hs1.add("Ankita");
        hs1.add("Rahul");
        hs1.add("Anjuli");
        hs1.add("Anki");
        //System.out.println(hs1);
        //output is [Rahul, Ankita, Anjuli]
        // so it's not stored based on insertion order rather on ascii/hashcode value
        hs1.add("Rahul");
        System.out.println(hs1);//duplicate value Rahul will not be stored so o/p is [Rahul, Ankita, Anjuli]

        //Now lets check the hashcode value of each element in Set hs1
        for(String s:hs1){
            System.out.println(s+"-->"+s.hashCode()); // to check with anita?
            //o/p is [Rahul, Ankita, Anjuli, Ankit]
        }

        //Methods of Hashset/Set
        HashSet<String> hs2=new HashSet<String>();
        hs2.add("love");
        hs2.add("india");
        System.out.println(hs2);
        hs1.addAll(hs2);
        //addAll() method accepts collection as an argument & adds all elements of one set to another set
        // also /addAll() method returns boolean
        System.out.println(hs1);
        hs1.remove("Anki");
        //remove() method takes object as argument and returns boolean
        System.out.println("Set after removing Anki :"+" "+hs1);
        System.out.println("Size of Set is :"+" "+hs1.size());
        //size() method does not take any argument but returns integer value
        System.out.println(hs1.contains("Anki")); //output is false
        System.out.println(hs1.contains("Ankita")); //output is true
        //contains() method takes Object as an argument but returns boolean value, true if condition is satisfied else false
        /*hs1.clear();// clear() method does not take any argument and returns void
        System.out.println(hs1);//clear() method deleted all data of Set hs1, so it returns empty set []*/
         hs1.clone(); //clone() method do not take any argument and returns object
        //System.out.println(hs1.clone());
      /*  HashSet<String> hs3=new HashSet<String>((Collection<? extends String>) hs1.clone());
          //Using above line we store the cloned value in another Set hs3
          //Also Object is typecast to String type - need to check with Ankita?
        System.out.println("HashSet hs3 is :"+" "+hs3);*/
        System.out.println(hs1.isEmpty());
        //isEmpty() method do not take any argument and return boolean value
        System.out.println(hs1.equals(hs));
        //equals() method takes object as argument and returns boolean
        System.out.println(hs1.hashCode());
        //hashcode() method do not take any argument and returns integer value

        }
    }

