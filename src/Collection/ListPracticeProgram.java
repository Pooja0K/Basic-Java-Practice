package Collection;
import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

import java.util.*;

public class ListPracticeProgram {
    public static void main(String[] args) {
     //   1.Create a list ‘Address’ to add below items [ c, 1003, Wakad, Pune, 411057]
        List<String> address = new ArrayList();
        address.add("c");
        address.add("1003");
        address.add("Wakad");
        address.add("Pune");
        address.add("411057");
        //System.out.println(address);

        //2. Create a new list from above list ‘Address’. Add below data into new list [e,604,Costa Rica, Wakad,Pune,411057]
        //New list should appear like [ c, 1003, Wakad, Pune, 411057 , e,604,Costa Rica, Wakad,Pune,411057]
        List<String> address1 = new ArrayList<>(address);
        //System.out.println(address1);
        //address1.addAll(5, Collections.singleton("e,604,Costa Rica, Wakad,Pune,411057"));- to be checked
        //List< String> a1= Arrays.asList(new String[]{"e,604,CostaRica, Wakad,Pune,411057"});-why new?
        //address1.addAll(a1);
        //System.out.println(address1);
        List<String> a2 = Arrays.asList("e", "604", "Costa Rica", "Wakad", "Pune", "411057");
        address1.addAll(a2);
        //Arrays.asList(new String[]{"e,604,CostaRica, Wakad,Pune,411057"}).addAll(address1);
        //above line throws unsupported exception
        //need to check with ankita for above lines 20,21,22-unsupported exception
        //address1.addAll(Arrays.asList(new String[]{"e,604,Costa Rica, Wakad,Pune,411057"}));
        //why we have to add new string[] type ? and size is 6 its taking whole as 1 String
        System.out.println("New Address Arraylist is :"+" "+address1);

        //4. Find out size of above array
        System.out.println("Size of array is"+" "+address1.size());//11
        //System.out.println(address1.indexOf("411057"));//4
        //System.out.println(address1.lastIndexOf("411057"));//10

       // 3.Find out index of 411057 from above list
        for (int i = 0; i < address1.size(); i++) {
            if (address1.get(i).contains("411057")) {
                System.out.println("Index of 411057 is: "+" "+i);

               // 5.Add an element “Maharashtra” after every 411057
                address1.add(i + 1, "Maharashtra");
            }
        }
        System.out.println("Adding Maharashtra after every 411057: "+" "+address1);

        //6.Remove element from index 1
        address1.remove(1);
        System.out.println("Arraylist after removing value at first index :"+" "+address1);

       // 7.Remove duplicate elements from above Arraylist

        for (int j = 0; j < address1.size(); j++) {
            for (int k = j+1; k < address1.size(); k++) {
                if (address1.get(j)==address1.get(k)) {
                    address1.remove(k);
                }
            }
        }
        System.out.println("Arraylist after removing duplicate elements :"+" "+address1);

        //8.WAP to search “Costa rica” from above list
              if ((address1.contains("Costa Rica"))) {
                      System.out.println("Costa Rica Found");
        }
              else {
                  System.out.println("Costa Rica not Found");
              }

        //9. WAP to sort above array
        address1.sort(Comparator.naturalOrder());
        System.out.println("Sorted arraylist is :"+" "+address1);
        /*Collections.sort(address1);
        for(String str:address1){
            System.out.print(str+" ");
        }*/
        //10. WAP to reverse elements of array
        /*Collections.reverse(address1);
        System.out.println("Reversed array"+address1);*/
        List<String> address3 = new ArrayList();

        for (int i=address1.size()-1; i>=0; i--) {
            address3.add(address1.get(i));
        }
        System.out.println("Reverse address"+address3);

        //List 1- {1,2,3,4,5}
        //List 2-{2,5,1,7,4,9}
        //11.WAP to Create a list with unique elements from list 1 and list 2 //[1,2,3,4,5,7,9]
        List<Integer> li=Arrays.asList(1,2,3,4,5);
        List<Integer> li1=Arrays.asList(2,5,1,7,4,9);
        List<Integer> li2=new ArrayList<>(li);
        li2.addAll(li1);
        System.out.println("Integer array list is:"+" "+li2);
        HashSet<Integer> hs=new HashSet<>(li2);
        System.out.println("List after Duplicate elements are removed : "+" "+hs);

        //12.WAP to create a list with only common elements from both list // [1,2,4,5]

        List<Integer> lii=new ArrayList<>(li);
        List<Integer> lii1=new ArrayList<>(li1);
        lii.retainAll(lii1);
        System.out.println("List contains only common elements"+" "+lii);



        }
    }


