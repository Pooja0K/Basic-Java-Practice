package OopsAbstraction;

public interface SessionInterface {
   int a=1000;
  //variable in interface must bbe initialized and by default it is public final static
  //if we try to make variable 'a' as private compiler error is thrown private is not allowed here
  //if we try to make variable 'a' as protected compiler error is thrown protected  is not allowed here

    //void SessionInterface();
    //getting compiler error method 'SessionInterface()' is same as class name and is never used
    //we cannot have constructor in Interface as we cannot instantiate Interface



  void m1();  // methods in interface cannot have body as its abstract method
  //if we try to make METHOD 'm1' as private compiler error is thrown private is not allowed here
  ////if we try to make METHOD 'm1' as protected compiler error is thrown protected  is not allowed here
  void m2(); // if we try to write body for method in interface it throws compiler error
  void creditCard();  //methods are public or default in interface

 /* public static void main(String[] args) {s
    //SessionInterface ss= new SessionInterface();
    //we get compiler error for above line sayingSessionInterface is abstract cannot be instantiated
  }*/
}
