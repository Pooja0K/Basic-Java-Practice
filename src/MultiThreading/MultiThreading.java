package MultiThreading;

public class MultiThreading {

    public static void main(String[] args) {
        //Job1 j1= new Job1(); //Object created for j1 class
        //Job2 j2 =new Job2(); //Object created for j2 class
        Job3Runnable j3= new Job3Runnable();
        Job4Runnable j4=new Job4Runnable();
        //j1.start(); //Start method of Thread class is called which internally calls run method
        //j2.start();
        Thread t1=new Thread(j3);
        Thread t2=new Thread(j4);
        t1.start();
        t2.start();

               }

    }

