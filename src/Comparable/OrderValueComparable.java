package Comparable;

public class OrderValueComparable implements Comparable<Customer>{

    @Override
    public int compareTo(Customer c) {
        return c.order_value;
    }
}
