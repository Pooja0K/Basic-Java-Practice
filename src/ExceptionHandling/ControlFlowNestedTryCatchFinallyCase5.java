package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase5 {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2" );
            System.out.println(" Outer Try block Stmt--> 3");
            try{
                System.out.println(" Outer Try block Stmt--> 4");
                System.out.println(" Outer Try block Stmt--> 5" +(10/0));//Risky code
                System.out.println(" Outer Try block Stmt--> 6");

            }
            catch (NullPointerException e){
                System.out.println(" Inner Catch block Stmt--> 7");
            }
            finally {
                System.out.println(" Inner Finally block Stmt--> 8");
            }
            System.out.println(" Inner Finally block Stmt--> 9");
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
//Case5: If exception is raised at stmt 5 & corresponding inner catch block not matched
// but outer catch block then which line will be executed?
//Ans: Stmt 1,2,3,4,8,10,11 & 12 will be executed
//Outer try will be executed
// Inner try, catch & finally block will get executed but not stmt9 as exception
// occurred inside inner try block but inner catch not matched so control goes to outer catch
//  Outer-catch block will get executed as exception raised in inner try not matched with inner catch but matched with outer try
//Outer finally and remaining line of code will get executed & Normal Termination

