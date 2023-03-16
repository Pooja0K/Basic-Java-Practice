package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateListDataTypeSession {
    public static void main(String[] args) {
        //WAP to remove duplicate elements from ArrayList without using double for loop or Set
        List<Integer> ls= new ArrayList<>(Arrays.asList(1,3,2,4,2,3,6));
        List <Integer>ls1= new ArrayList<>();
        for(int num: ls){
            if(!ls1.contains(num)){
                ls1.add(num);
            }
        }
        System.out.println("Removed duplicate element"+" "+ls1);
        System.out.println("================");
        //1st way to iterate over ArrayList using ForEach loop as below
        for(int a: ls) {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("================");
        //2nd Way to iterate over ArrayList using normal for loop
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
        System.out.println();
        System.out.println("================");
        //3rd Way to iterate over ArrayList using normal for loop
        Iterator<Integer> itr=ls.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("================");

        //4th Way to iterate over List is by using Stream which came in Java 1.8 version
        ls.stream().forEach(System.out::print);

        System.out.println();
        System.out.println("================");

        //WAP to print even number from List 'ls' using stream() which came in Java 1.8 version
        ls.stream().filter(a->a%2==0).forEach(System.out::print);
        //above line excepts filter() method which takes predicate as argument
        //Predicate/Functional Interface- it has only one abstract method
        System.out.println();
        System.out.println("================");

        System.out.println(ls.stream().count());


    }
}
