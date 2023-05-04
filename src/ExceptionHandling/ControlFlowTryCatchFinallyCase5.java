package ExceptionHandling;

public class ControlFlowTryCatchFinallyCase5 {
    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2");
            System.out.println("Stmt-->3");
        }
        catch (ArithmeticException e){
            System.out.println("Stmt-->4");
        }
        finally {
            System.out.println("Stmt-->5"+(10/0)); //Risky code
        }
        System.out.println("Stmt-->6");
    }
}


//Case5: If exception is raised at stmt5 then which  all line of code will be executed?
//Ans: Stmt1,2,3, catch block won't get executed & Abnormal Termination at stmt5 with exception message
//Catch block won't get executed as no exception triggered in try
//Finally block won't get executed as exception occurred
//Remaining code stmt 6 won't get executed & Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ControlFlowTryCatchFinallyCase5.main(ControlFlowTryCatchFinallyCase5.java:14)