package GarbageCollection;

public class GarbageCollection {
    int a;
    int b;

    public void setData(int c, int d){
        a=c;
        b=d;
    }

    public void displayData(){
        System.out.println("Display data : "+a+" "+b);
    }
    public static void main(String[] args) {
        GarbageCollection d1= new GarbageCollection();
        GarbageCollection d2= new GarbageCollection();
        d1.setData(1,2);
        d2.setData(4,5);

        d1.displayData();
        d2.displayData();

        GarbageCollection d3;
        d3=d2;
        d3.displayData();

        GarbageCollection d4; // unreferenced object

        d2=null; //assigning null value so d2 will become null & unreferenced
        d2.displayData();

        //unreferenced object d2 & d4 will be collected by garbage collection in java


    }
}
