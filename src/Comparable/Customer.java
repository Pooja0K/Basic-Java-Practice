package Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Customer implements Comparable<Customer> {
    String name;
    String purchased_item;
    int order_value;
    String order_no;

    Customer(String name, String purchased_item, int order_value, String order_no) {
        this.name = name;
        this.purchased_item = purchased_item;
        this.order_value = order_value;
        this.order_no = order_no;
    }

    @Override
    public int compareTo(Customer c) {
        return order_no.compareTo(c.order_no);
    }

    public static void main(String[] args) {
        Customer c = new Customer("Pooja", "Book", 2000, "A01");
        Customer c1 = new Customer("Ankita", "Book", 20100, "A011");
        Customer c2 = new Customer("Anjali", "Book", 25454, "A0111");
        List<Customer> cus = new ArrayList<>();
        cus.add(c);
        cus.add(c1);
        cus.add(c2);
        Collections.sort(cus);
        for (Customer cust : cus) {
            System.out.println(cust.name + " " + cust.purchased_item + " " + cust.order_value + " " + cust.order_no);
        }
    }
}
