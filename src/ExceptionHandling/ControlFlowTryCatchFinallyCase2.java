package ExceptionHandling;

public class ControlFlowTryCatchFinallyCase2 {
    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2"+(10/0));
            System.out.println("Stmt-->3");
        }
        catch (ArithmeticException e){
            System.out.println("Stmt-->4");
        }
        finally {
            System.out.println("Stmt-->5");
        }
        System.out.println("Stmt-->6");
    }
}
//Case2: If exception is raised at stmt2 & corresponding catch block matched
// then which  all line of code will be executed?
//Ans: Stmt1,4,5 & 6 catch block won't get executed & Normal Termination