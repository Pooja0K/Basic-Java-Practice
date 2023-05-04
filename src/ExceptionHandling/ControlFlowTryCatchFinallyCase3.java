package ExceptionHandling;

public class ControlFlowTryCatchFinallyCase3 {
    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2"+(10/0)); //Risky code
            System.out.println("Stmt-->3");
        }
        catch (NullPointerException e){
            System.out.println("Stmt-->4");
        }
        finally {
            System.out.println("Stmt-->5");
        }
        System.out.println("Stmt-->6");
    }
}
//Case3: If exception is raised at stmt2 & corresponding catch block not matched
// then which  all line of code will be executed?
//Ans: Stmt1 & 5 will get executed as stmt 5 is in finally block
// catch block won't get executed  as it is not throwing Arithmetic/Runtime/Exception type
// Remaining Stmt6 won't get executed & Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ExceptionHandling.ControlFlowTryCatchFinallyCase3.main(ControlFlowTryCatchFinallyCase3.java:7)