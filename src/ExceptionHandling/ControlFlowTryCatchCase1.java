package ExceptionHandling;

public class ControlFlowTryCatchCase1 {
    public static void main(String[] args) {
        try{
        System.out.println("Stmt-->1");
        System.out.println("Stmt-->2");
        System.out.println("Stmt-->3");
        }
        catch (ArithmeticException e){
            System.out.println("Stmt-->4");
        }
        System.out.println("Stmt-->5");
    }
}
//Case1: If there is no exception which all line of code will be executed?
//Ans Stmt1,2,3 & 5 catch block won't get executed & Normal Termination