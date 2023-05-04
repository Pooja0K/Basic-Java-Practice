package ExceptionHandling;

public class ControlFlowTryCatchFinallyCase4 {

    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2");
            System.out.println("Stmt-->3"+(10/0));  //Risky code
        }
        catch (ArithmeticException e){
            System.out.println("Stmt-->4"+(1/0)); //Risky code
        }
        finally {
            System.out.println("Stmt-->5");
        }
        System.out.println("Stmt-->6");
    }
}
//Case4: If exception is raised at stmt4 , then which  all line of code will be executed?
//Ans: Either due to stmt1, 2, or 3 Exception will be raised that is why control would goto catch black
// so either of these line might not get executed
// But as per above code stmt 1,2 & 5(finally ) will get executed & Abnormal termination message
//  Catch block also won't get executed as exception occurred & Stmt6 (remaining code) won't get executed
// As exception is not handled inside catch black so Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ControlFlowTryCatchFinallyCase4.main(ControlFlowTryCatchFinallyCase4.java:12)
