package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase13 {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2" );
            System.out.println(" Outer Try block Stmt--> 3"+(5/0));
            try{
                System.out.println(" Outer Try block Stmt--> 4");
                System.out.println(" Outer Try block Stmt--> 5");
                System.out.println(" Outer Try block Stmt--> 6"+(10/0));//Risky code

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
            System.out.println(" Outer Catch block Stmt--> 10"+(1/0));
        }
        finally {
            System.out.println(" Outer Finally block Stmt--> 11");
        }
        System.out.println(" Outer Catch block Stmt--> 12");
    }
}
//Case10: If exception is raised at stmt 10 then which line will be executed?
//Ans: Stmt X,X,X,X,X,X,X,8,10,11 & 12 will be executed followed by normal termination message
//Then either stmt 1 or 2 or 3 may or may not get executed as anyone of it has Risky code that caused exception
// Then either stmt 4 or 5 or 6 may or may not get executed as anyone of it has Risky code that caused exception
// Inner-catch may or may not execute
// Control goes to inner finally and get executed if inner catch gets executed
// stmt9 may or may not get executed based on exception handled at inner catch or not
//  Outer-catch block will not get executed as exception there
//Outer finally will be executed
// Remaining line of code stmt 12  will not get executed & abnormal Termination

//OUTPUT IS stmt1,2 & 11
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ExceptionHandling.ControlFlowNestedTryCatchFinallyCase13.main(ControlFlowNestedTryCatchFinallyCase13.java:8)










