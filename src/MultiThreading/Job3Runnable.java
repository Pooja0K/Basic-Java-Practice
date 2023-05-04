package MultiThreading;

public class Job3Runnable implements Runnable {

    @Override
    public void run() {
        print();
    }

    public void print() {
        for (int i = 500; i <= 600; i++) {
            System.out.println(i);
        }
    }
    public void start() {
        run();
    }
}
