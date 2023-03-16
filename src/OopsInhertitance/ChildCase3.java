package OopsInhertitance;

public class ChildCase3 extends Parent {
    int y = 30;
    int z = 40;

    public void m2() {
        System.out.println("This is m2 method of ChildCase3 class");
    }

    public void m3() {
        System.out.println("This is m3 method of ChildCase3 class");
    }

    public static void main(String[] args) {
        //Case#3
        Parent p = new ChildCase3();
        // we have created instance of ChildCase3 class in main method of child class using reference of Parent class
        // This is case of Dynamic polymorphism in this case behaviour is different during run time and execution time

        System.out.println(p.x);
        //There is variable x present in Parent class so with Parent p reference it will access x
        System.out.println(p.y);
        //There is variable y present in Parent class so with Parent p reference it will access y
        //System.out.println(p.z);
        //There is no variable z present in Parent class so with Parent p reference it cannot access z hence error
        //So we cannot call variable z with Parent's class reference p
        p.m1();
        //There is method m1 present in Parent class so with Parent p reference it will access m1
        p.m2();
        //There is method m2 present in Parent class so with Parent p reference it will access m2
        //p.m3();
        // There is  no method m3 present in Parent class so with Parent p reference it cannot access m3 so error

        //While compilation java compiler checks left side i.e. Parent p


    }
}






