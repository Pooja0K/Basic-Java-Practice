package Array;
public class Student {
    String name="Ankita";
    int rollnum= 19;
    int marks=100;

    public  Student (String nm, int rnum, int mrk)
    {
     this.name=nm;
     this.rollnum=rnum;
     this.marks=mrk;
    }

    public Student() {
        String name="Ankita";
        int rollnum= 19;
        int marks=100;
    }

    public static void main(String[] args) {
        Student s=new Student ("Pooja",20,80);
        System.out.println("Name of Student is: "+s.name);
        System.out.println("Roll-number of Student is: "+s.rollnum);
        System.out.println("Student has scored "+s.marks + " in Java");
        Student s1 =new Student ("Anjali",21,90);
        System.out.println('\n');
        System.out.println("Name of Student is: "+s1.name);
        System.out.println("Roll-number of Student is: "+s1.rollnum);
        System.out.println("Student has scored "+s1.marks + " in Java");
        Student s2 =new Student();
        System.out.println('\n');
        System.out.println(s2.name+" "+s2.rollnum+" "+s2.marks);
        //Student s3 =new Student();

    }
}
