package OopsAbstraction;

public class HDFC implements SessionInterface {
//As soon as we try to implement SessionInterface in HDFC class we get error/warning
//saying we can either make HDFC AN ABSTRACT class or implement methods of SessionInterface
    void HDFC(){
        System.out.println("This is constructor of HDFC class");
    }
    @Override
    public void m1() {
        System.out.println("This is m1 method implemented in class HDFC");
    }

    @Override
    public void m2() {
        System.out.println("This is m2 method implemented in class HDFC");
    }

    @Override
    public void creditCard() {
        boolean flag=true;
        while(flag){
            System.out.println("Credit Card of HDFC bank");
            flag=false;
        }

    }

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.m1();
        hdfc.m2();
        hdfc.creditCard();
        System.out.println(SessionInterface.a);
        //As 'a' is static variable we can call it with reference of SessionInterface
        //SessionInterface.a=2000; //compiler error cannot assign a value to a final variable
        //SessionInterface.a;?//not a statement means?
        System.out.println();
        hdfc.HDFC();
    }
}
