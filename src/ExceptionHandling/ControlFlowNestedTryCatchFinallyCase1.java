package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase1 {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2");
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
//Case1: If there is no exception which all line of code will be executed?
//Ans Stmt1,2,3,4,5,6,8,9,11 & 12 will get executed
// catch block won't get executed as no exception raised & Normal Termination
