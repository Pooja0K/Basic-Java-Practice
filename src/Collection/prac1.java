package Collection;

import java.util.*;

public class prac1 {
    public static void main(String[] args) {
        /*ArrayList<String> numbers = new ArrayList<>();
        numbers.add("10");

        System.out.println(numbers);	// [2, null]
        ArrayList<String> retainedNumbers = new ArrayList<>();
        retainedNumbers.add("1");
        retainedNumbers.add("2");
        System.out.println(retainedNumbers);	// [1, 3]
        System.out.println(retainedNumbers.retainAll(numbers)); // true
        System.out.println(retainedNumbers);*/

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("10");
        System.out.println(numbers);	// [10]
        ArrayList<String> numbers1 = new ArrayList<>();
        numbers1.add("1");
        numbers1.add("2");
        numbers1.add("3");
        System.out.println(numbers1);	// [1, 2, 3]
        System.out.println(numbers1.retainAll(numbers)); // true
        System.out.println(numbers1);	// [10
    }
}