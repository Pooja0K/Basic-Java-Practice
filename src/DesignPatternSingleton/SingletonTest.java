package DesignPatternSingleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton s2= Singleton.getInstance();
        System.out.println(s2);
        s2.display();
        s2.print();
        Singleton s3= Singleton.getInstance();
        System.out.println(s3);
        Singleton s4= Singleton.getInstance();
        System.out.println(s4);
    }
}

