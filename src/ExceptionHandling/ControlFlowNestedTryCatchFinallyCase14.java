package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase14 {
    public static void main(String[] args) {
        try{
            System.out.println(" Outer Try block Stmt--> 1");
            System.out.println(" Outer Try block Stmt--> 2" );
            System.out.println(" Outer Try block Stmt--> 3");
            try{
                System.out.println(" Outer Try block Stmt--> 4");
                System.out.println(" Outer Try block Stmt--> 5");
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
        catch (ClassCastException e){
            System.out.println(" Outer Catch block Stmt--> 10");
        }
        finally {
            System.out.println(" Outer Finally block Stmt--> 11"+(10/0));
        }
        System.out.println(" Outer Catch block Stmt--> 12");
    }
}
//Case11: If exception is raised at stmt 11 or stmt 12 then which line will be executed?
//It is always abnormal termination











