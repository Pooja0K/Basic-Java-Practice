package Collection;
import java.util.*;
import java.util.Arrays;

public class Employee {

    int age;
    String name;
    int salary;

    Employee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(25, "Rahul", 3000);
        Employee e2 = new Employee(26, "Anjuli", 2000);
        Employee e3 = new Employee(27, "Pooja", 5000);
        List<Employee> list = Arrays.asList(e1, e2, e3);

        System.out.println(list);

        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()) {

           itr.next();
        }

    }

}



