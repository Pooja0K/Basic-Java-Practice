package MultiThreading;

public class Job1 extends  Thread {
    //This is overridden method of thread class
    @Override
    public void run() {
        try {
            print();  // Implementation has been changed/added
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() throws InterruptedException {
        for(int i=1;i<=100;i++){
            Thread.sleep(100);
            System.out.println(i);
        }
    }
}
