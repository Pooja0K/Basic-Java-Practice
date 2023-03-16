package OopsInhertitance;

public class ChildCase1 extends Parent{
    //This is Child class/subclass
    //We use extends keyword for Inheritance
    //we write Child class name and then extends keyword and after that Parent class name
    //right side of extends keyword is Parent class and left side is child class
     int y=30;
     int z=40;

    public  void m2(){
        System.out.println("This is m2 method of ChildCase1 class");
    }

    public  void m3(){
        System.out.println("This is m3 method of ChildCase1 class");
    }

    public static void main(String[] args) {
        //Case#1
        Parent p = new Parent(); // we have created instance of Parent class in main method of child class
        System.out.println(p.x); //parent class x
        System.out.println(p.y); //parent class y
        //System.out.println(p.z); //parent class z
        p.m1(); //parent class method m1
        p.m2(); //parent class method m2
        //p.m3();
        //parent class method m2, while compilation java compiler checks left side i.e.
        // Parent p and as no such m3 method is present so, it throws error same goes with variable z
        //Hence we cannot write p.z and p.m3(); as it will give compilation error so commenting it out
        //while execution compiler looks at right side i.e. new Parent()
        // now as parent class is there so all the methods or variables of Parent class will be executed

    }
}
