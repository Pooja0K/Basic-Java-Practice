package OopsAbstraction;

public abstract class Session2 {

     Session2(){
        System.out.println("This is constructor of abstract class Session2");
    }
    // This means we can have constructor in abstract class
    abstract void m3();
    // As soon as we make method m3() and don't give body compiler gives warning to make this method ad abstract
    // When we make method m3() as abstract compiler throws error to either make class 'Session2' as abstract
    //or ask to add implementation to method m3() and remove abstract keyword
    //This means as soon as we make any one method in class as abstract we also have to make that class as abstract

    void m4(){
        System.out.println("This is abstract class Session2 method m4 with implementation");
    }
    // This means we can have both implemented and abstract method in abstract class

    public static void main(String[] args) {
        //Session2 ss= new Session2();
        //Abstract class cannot be instantiated because it has half implemented methods
        //so compiler throws error when trying to instantiate abstract class
    }

}
