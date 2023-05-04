package ExceptionHandling;

public class UncheckedException {

    static void printValue(){

        try{
        int a=10;
        int b=0;
        int c=(a/b); //Risky code
        System.out.println(c); }

        catch (Exception e){
            System.out.println("This is runtime Exception " +e);
        }
    }

    public static void main(String[] args) {

        UncheckedException.printValue();

    }
}
