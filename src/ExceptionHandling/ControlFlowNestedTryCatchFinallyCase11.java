package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase11 {

    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2" );
            System.out.println(" Outer Try block Stmt--> 3");
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
            System.out.println(" Inner Finally block Stmt--> 9"+(1/0));
        }
        catch (Exception e){
            System.out.println(" Outer Catch block Stmt--> 10");
        }
        finally {
            System.out.println(" Outer Finally block Stmt--> 11");
        }
        System.out.println(" Outer Catch block Stmt--> 12");
    }
}
//Case10: If exception is raised at stmt 9 & corresponding catch block matched then which line will be executed?
//Ans: Stmt 1,2,3,X,X,X,X,8,10,11 & 12 will be executed followed by normal termination message
//Outer try will be executed
// Then either stmt 4 or 5 or 6 may or may not get executed as anyone of it has Risky code that caused exception
// Inner-catch may or may not execute and not matched so won't get executed
// Control goes to inner finally and get executed
// stmt9 will also not get executed as exception occurred at stmt 9
//  Outer-catch block will get executed as exception raised at stmt 9 matches corresponding outer catch
//Outer finally will be executed
// Remaining line of code stmt 12  will get executed & normal Termination

//OUTPUT IS stmt1,2,3,4,5,8,10,11& 12









