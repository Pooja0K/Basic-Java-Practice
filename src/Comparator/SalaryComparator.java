package Comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e, Employee e1) {
        return e.salary- e1.salary;
    }
}
