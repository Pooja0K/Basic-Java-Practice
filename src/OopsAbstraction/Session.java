package OopsAbstraction;

public class Session extends Session2{
    // As soon as we try to extend abstract class compiler throws error saying
    //class Session can be either abstract or implement abstract methods of abstract class Session2
     Session(){
        System.out.println("This is constructor of Session class");
    }
    @Override
    void m3() {
        System.out.println("This is abstract method of m3 class but implemented in Session class");
           }

    void m6(){
        System.out.println("This is method of Session class");
    }

    void m4(){
        System.out.println("This is method of Session2 abstract class but override in  class Session");
    }

    public static void main(String[] args) {
        Session session = new Session();
        //session.Session2(); //constructor of abstract class Session2-Parent
        //session.Session(); // constructor of abstract class Session->child
        //session.m3(); // method of class Session2-Parent but implemented in class Session
        //session.m4(); // method of class Session2-Parent but override(n) in class Session
        //session.m6(); //method of class Session
    }
}
