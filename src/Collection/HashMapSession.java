package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapSession {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<Integer,String>();
        //This line creates map object
        map.put(1,"Pooja"); //put() method is used to add or store value in HashMap
        map.put(2,"Rahul");
        map.put(3,"Ankita");
        map.put(4,"Anushka");
        //map.put(null,null);
        //map.put(null,null);//null key value insertion is not allowed 2nd time
        System.out.println(map);
        //o/p {null=null, 1=Pooja, 2=Rahul, 3=Ankita, 4=Anushka}
        //map.put(3,"Akash"); //duplicate key is not allowed, it replaces the key with the latest value
        //System.out.println(map);
        //op {null=null, 1=Pooja, 2=Rahul, 3=Akash, 4=Anushka}
        //map.put(5,"Akash"); //duplicate value is allowed
        //System.out.println(map);
        //op {null=null, 1=Pooja, 2=Rahul, 3=Akash, 4=Anushka, 5=Akash}*/
        //map.get("1");
        System.out.println(map.get(1));
    }
}
