package OopsInhertitance;

public class ChildCase5 extends Parent {
        int y=30;
        int z=40;

        public  void m2() {
            System.out.println("This is m2 method of ChildCase2 class");
        }

        public  void m3() {
            System.out.println("This is m3 method of ChildCase2 class");
        }

        public static void main(String[] args) {
            //Case#5
            Parent p= new Parent(); //case1
            // we have created instance of Parent class
            Parent p1= new ChildCase5(); //case3
            // we have created instance of ChildCase5 class using reference of Parent p1
            p=p1; //assigning p1 to p
           // Above statement(p=p1) can be decoded as Parent p = new ChildCase5();
            System.out.println(p.x);
            //There is no variable named x in child class but,
            // it extends inherits Parent class so compiler takes parent class variable x
            System.out.println(p.y); //ChildCase5 class y
           // System.out.println(p.z); //ChildCase5 class z
            p.m1(); //parent class method m1 because no m1 method in ChildCase5 but, it extends Parent class
            p.m2(); //ChildCase5 class method m2
           // p.m3(); // ChildCase2 class method m3

    }





}
