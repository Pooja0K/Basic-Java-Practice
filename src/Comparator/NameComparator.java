package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e, Employee e2) {
        return e.name.compareTo(e2.name);
    }
}
