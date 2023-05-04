package ExceptionHandling;

public class ControlFlowNestedTryCatchFinallyCase7 {
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
            catch (ArithmeticException e){
                System.out.println(" Inner Catch block Stmt--> 7" +(1/0)); //Risky code
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
//Case7: If exception is raised at stmt 7 & corresponding catch block matched then which line will be executed?
//Ans: Stmt 1,2,3,4,8,10,11 & 12 will be executed
//Outer try will be executed
// Then either stmt 4 or 5 or 6 might not get executed as anyone of it has Risky code that caused exception
// Inner-catch matched but has risky code,so finally block executed
// But  stmt9 will not get executed as exception occurred in matching inner catch & control moves to outer catch
//  Outer-catch block will get executed as exception raised in inner catch  matched with outer catch
//Outer finally & remaining line of code stmt 12  will get executed & Normal Termination


