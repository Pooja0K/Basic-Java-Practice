package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase8 {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2" );
            System.out.println(" Outer Try block Stmt--> 3");
            try{
                System.out.println(" Outer Try block Stmt--> 4");
                System.out.println(" Outer Try block Stmt--> 5"+(10/0));//Risky code
                System.out.println(" Outer Try block Stmt--> 6");
                // either stmt 4 or 5 or 6 has Risky code that's why control went inside inner catch
            }
            catch (NullPointerException e){
                System.out.println(" Inner Catch block Stmt--> 7");
            }
            finally {
                System.out.println(" Inner Finally block Stmt--> 8");
            }
            System.out.println(" Inner Finally block Stmt--> 9");
        }
        catch (ClassCastException e){
            System.out.println(" Outer Catch block Stmt--> 10");
        }
        finally {
            System.out.println(" Outer Finally block Stmt--> 11");
        }
        System.out.println(" Outer Catch block Stmt--> 12");
    }
}
//Case8: If exception is raised at stmt 8 & corresponding catch block not matched then which line will be executed?
//Ans: Stmt 1,2,3,4,8 & 11 will be executed followed by Abnormal termination message
//Outer try will be executed
// Then either stmt 4 or 5 or 6 might not get executed as anyone of it has Risky code that caused exception
// Inner-catch not matched so won't get executed but inner finally block will get executed
// But  stmt9 will not get executed as exception occurred in matching inner catch & control moves to outer catch
//  Outer-catch block will not get executed as exception raised in inner try did not match with outer catch
//Outer finally will be executed
// Remaining line of code stmt 12  will not get executed & Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ControlFlowNestedTryCatchFinallyCase8.main(ControlFlowNestedTryCatchFinallyCase8.java:11)



