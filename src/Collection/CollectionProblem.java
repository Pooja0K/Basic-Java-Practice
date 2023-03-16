package Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionProblem {

    Integer array[]={1,2,5,3,1,5,7,2};
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(array));
    //1. WAP to iterate elements of below HashSet and print same
   public Set<String> printElementsOfHasMap(Set<String> set){
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return set;
    }
   //2.WAP to check if above set contains  a.”Kiwi” b.”Watermelon”
    public void checkFruitInHashSet(Set<String> set, String Str){
       if(set.contains(Str)){
           System.out.println("Set contains:"+" "+Str);
        }
       else{
           System.out.println("Set does not contains:"+" "+Str);
       }
           }

           //3.WAP to remove duplicate elements from below array [1,2,5,3,1,5,7,2]


    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(Arrays.asList("Apple", "Banana", "Grapes","Watermelon", "Orange"));
        CollectionProblem collectionProblem= new CollectionProblem();
        collectionProblem.printElementsOfHasMap(set);
        collectionProblem.checkFruitInHashSet(set, "Kiwi");
        collectionProblem.checkFruitInHashSet(set, "Watermelon");


    }
}
