package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase3 {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2" +(10/0)); //Risky code
            System.out.println(" Outer Try block Stmt--> 3");
            try{
                System.out.println(" Outer Try block Stmt--> 4");
                System.out.println(" Outer Try block Stmt--> 5");
                System.out.println(" Outer Try block Stmt--> 6");

            }
            catch (ArithmeticException e){
                System.out.println(" Inner Catch block Stmt--> 7");
            }
            finally {
                System.out.println(" Inner Finally block Stmt--> 8");
            }
            System.out.println(" Inner Finally block Stmt--> 9");
        }
        catch (NullPointerException e){
            System.out.println(" Outer Catch block Stmt--> 10");
        }
        finally {
            System.out.println(" Outer Finally block Stmt--> 11");
        }
        System.out.println(" Outer Catch block Stmt--> 12");
    }
}
//Case3: If exception is raised at stmt2 & corresponding catch block not matched then which line will be executed?
//Ans: Stmt 1 & 11 will be executed
// Inner try, catch & finally block will not get executed as control did not enter this block
// Outer catch block will get executed as exception raised in outer try matches with outer catch block
//Outer finally and remaining line of code will get executed & Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ControlFlowNestedTryCatchFinallyCase3.main(ControlFlowNestedTryCatchFinallyCase3.java:7)