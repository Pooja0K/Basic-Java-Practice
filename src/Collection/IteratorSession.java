package Collection;
import java.util.*;

public class IteratorSession {
    public static void main(String[] args) {
        Integer array[] = {1, 2, 3, 2, 4, 1};
        //integer type array named array with above declared value
        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(array));
        //Create Hashset object hs of type integer
        //hs.addAll(Arrays.asList(array));
        System.out.println(hs);

        Iterator<Integer> it = hs.iterator();
        //Here we are not creating object of Iterator Interface(no new keyword used)
        //Iterator is interface and cannot be instantiated
        //In above line we are declaring variable of type Iterator
        //And using iterator() method to return number of elements in HashSet hs

       /* while (it.hasNext())
        //method hasNext() of Iterator is used to check
        // if there is any next element present in HashSet 'hs' or not
        // It returns boolean value true if next element is present else false
            {
                System.out.print(" "+it.next());
            }*/

        while (it.hasNext()){
            if(it.next()==3){
                System.out.println(it.next());
                it.remove();
            }
            else {
                System.out.println(it.next());
            }
        }

    }
}



