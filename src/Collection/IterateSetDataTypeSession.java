package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSetDataTypeSession {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>(Arrays.asList(1,3,2,4,2,3,6));

        //1st way to iterate over Set is by using ForEach loop as below
        for(int a: hs){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("================");
        //2nd Way to iterate over set is by using Iterator
        Iterator<Integer> itr=hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("================");

        //3rd Way to iterate over Set is by using Stream which came in Java 1.8 version
        //get() method is not present in Hashset- so can't use normal for loop to iterate
        hs.stream().forEach(System.out::print);
    }
}
