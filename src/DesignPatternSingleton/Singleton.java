package DesignPatternSingleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){

        System.out.println("This is Singleton constructor");
    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


    public void display(){
        System.out.println("This is display method of Singleton Class");
    }

   public void print(){
       System.out.println("This is print method of Singleton class");
   }

}
