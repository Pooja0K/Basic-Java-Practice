package MultiThreading;

public class Job4Runnable implements Runnable{

    @Override
    public void run() {
        print();
    }
    public void print(){
        for(int i=601;i<=650;i++){
            System.out.println(i);
        }
    }


}
