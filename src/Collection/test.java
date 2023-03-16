package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class test {
    public static void main(String[] args) {
        List<String> address = new ArrayList();
        address.add("c");
        address.add("1003");
        address.add("Wakad");
        address.add("Pune");
        address.add("411057");
        //System.out.println(address);

        List<String> address1 = new ArrayList<>(address);

        List<String> address2 = Arrays.asList("e", "604", "Costa Rica", "Wakad", "Pune", "411057");
        address1.addAll(address2);
        System.out.println(address1);

        for (int j = 0; j < address1.size(); j++) {
            for (int k = j+1; k < address1.size(); k++) {
                if (address1.get(j)==address1.get(k)) {
                    address1.remove(k);
                }
            }
        }
        System.out.println("Arraylist after removing duplicate elements :"+" "+address1);
        //address1.get(1);
        //System.out.println(address1.get(1));
        List<String> address3 = new ArrayList();
         String rev="";
        for (int i=address1.size()-1; i>=0; i--) {
           rev= rev+address1.get(i); //Costa Rica

            System.out.println(rev);
                  }
        //System.out.println(address3);
    }
}
