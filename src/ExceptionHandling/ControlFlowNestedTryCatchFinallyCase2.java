package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase2 {
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
        catch (Exception e){
            System.out.println(" Outer Catch block Stmt--> 10");
        }
        finally {
            System.out.println(" Outer Finally block Stmt--> 11");
        }
        System.out.println(" Outer Catch block Stmt--> 12");
    }
}
//Case2: If exception is raised at stmt2 & corresponding catch block matched then which line will be executed?
//Ans: Stmt1,10,11 & 12 will be executed
// Inner try, catch & finally block will not get executed as control did not enter this block
// Outer catch block will get executed as exception raised in outer try matches with outer catch block
//Outer finally and remaining line of code will get executed & Normal Termination