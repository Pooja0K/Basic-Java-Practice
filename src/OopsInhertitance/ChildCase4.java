package OopsInhertitance;

public class ChildCase4 extends Parent {
        int y=30;
        int z=40;

        public void m2(){
            System.out.println("This is m2 method of ChildCase4 class");
        }

        public void m3(){
            System.out.println("This is m3 method of ChildCase4 class");
        }

        public static void main(String[] args) {
            //Case#4
            //ChildCase4 c = new Parent();
            // We are trying to create instance of Parent class c using reference of ChildCase4 c
            //Parent is superclass and higher in hierarchy than Child/subclass ChildCase4
            //Hence we are getting compilation error as we cannot convert from Parent to Child class
            //OR we cannot convert from high to low without typecast
            // So we are getting exception
            // java: incompatible types: InheritanceSession.Parent cannot be converted to InheritanceSession.ChildCase4

            //System.out.println(c.y);
            //c.m2();

        }
    }


