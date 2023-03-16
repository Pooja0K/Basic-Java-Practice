package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListHomoSession {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        //Arraylist a1 of type String is created using above statement
        //Default size of arraylist is 10 (elements)
        List<String> al1= Arrays.asList(new String[]{"xyz", "abc"});
        //Created new List of type String having 2 value xyz and abc
        al.add("Pooja");  // this will add Pooja in position 0 in arraylist al
        //add method accepts String argument and return type is boolean
        al.add("Ankita"); // this will add Ankita in position 1 in arraylist al
        al.add("Saket"); // this will add Saket in position 1 in arraylist al
        System.out.println(al); // this will print al [Pooja, Ankita, Saket]
        al.add(1,"k");
        //this method takes integer index and String argument and return type is void
        //this will insert element k at 1st position in arraylist a1
        // and shift every other element starting from position 1 to next
        //example here it will insert k after Pooja and then shift Ankita and saket by 1 position
        //so outcome will be [Pooja, k, Ankita, Saket]
        System.out.println(al);
        System.out.println( al.toArray().length);
        //this will convert arraylist to array and we can use methods of array like length etc here length is 4
        System.out.println(al1);
        al.addAll(al1);
        //add all the elements of al1 list to arraylist al
        System.out.println(al);

    }

}
