package OopsInhertitance;

public class ChildCase2 extends Parent{
    int y=30;
    int z=40;

    public  void m2(){
        System.out.println("This is m2 method of ChildCase2 class");
    }

    public  void m3() {
        System.out.println("This is m3 method of ChildCase2 class");
    }

    public static void main(String[] args) {
        //Case#2
        ChildCase2 c = new ChildCase2();
        // we have created instance of ChildCase2 class in main method of child class
        System.out.println(c.x);
        //There is no variable named x in child class but,
        // it extends inherits Parent class so compiler takes parent class variable x
        System.out.println(c.y); //ChildCase2 class y
        System.out.println(c.z); //ChildCase2 class z
        c.m1(); //parent class method m1 because no m1 method in ChildCase2 but, it extends Parent class
        c.m2(); //ChildCase2 class method m2
        c.m3(); // ChildCase2 class method m3
        //While compilation java compiler checks left side i.e.
        // ChildCase2 p and as no such m1 method is present but as ChildCase2 extends Parent class
        //so, it checks for m1 method in Parent class and as this method is present to no compilation error
        //Hence we can write p.x and p.m1();
        //While execution compiler looks at right side i.e. new ChildCase2()
        // now as ChildCase2 class is there so all the methods or variables of ChildCase2 class will be executed
        //And whatever values or variable is not present in child class and if present in Parent class then
        //parent class method and variable will be executed here in  this case method m1 and variable x

    }
}



