package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
        int empid;
        String dept;
        String name;
        int salary;

        Employee(int emp, String dpt, String nm, int sal)
        {
            this.empid=emp;
            this.dept=dpt;
            this.name=nm;
            this.salary=sal;
        }

    public static void main(String[] args) {
        Employee e =new Employee(1,"Tech","Ankita",40000);
        Employee e1 =new Employee(2,"Techno","Anjali",20000);
        Employee e2 =new Employee(3,"Techno","Saket",30000);
        Employee e3 =new Employee(4,"Techno","Pooja",10000);
        List<Employee> emp= new ArrayList<Employee>();
        emp.add(e);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println("Sort based on salary: ");
        Collections.sort(emp,new SalaryComparator());
        for(Employee empl: emp){

            System.out.println(+empl.empid+" "+empl.dept+" "+empl.name+" "+empl.salary);

        }
        System.out.println("=========================");
        System.out.println("Sort based on name: ");
        Collections.sort(emp,new NameComparator());
        for(Employee empl: emp){
            System.out.println(+empl.empid+" "+empl.dept+" "+empl.name+" "+empl.salary);

        }
    }
}
