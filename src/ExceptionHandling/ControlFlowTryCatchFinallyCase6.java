package ExceptionHandling;

public class ControlFlowTryCatchFinallyCase6 {

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
                System.out.println("Stmt-->5");
            }
            System.out.println("Stmt-->6"+(10/0)); //Risky code
        }
    }


//Case6: If exception is raised at stmt6 then which  all line of code will be executed?
//Ans: Stmt1,2,3 & 5(finally) & Abnormal Termination at stmt6 with exception message
//Catch block won't get executed as no exception triggered in try
//Finally block always gets executed as exception occurred
//Remaining code stmt 6 won't get executed due to exception raised & Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ControlFlowTryCatchFinallyCase6.main(ControlFlowTryCatchFinallyCase6.java:17)

