package ExceptionHandling;

public class ExceptionSession {

    static void printValue(){
        try{
        int a=10;
        int b=0;
        int c=(a/b);
        System.out.println(c); }

        catch (Exception e){
            System.out.println("This is runtime Exception " +e);
        }
    }

    public static void main(String[] args) {
        ExceptionSession.printValue();
    }
}
