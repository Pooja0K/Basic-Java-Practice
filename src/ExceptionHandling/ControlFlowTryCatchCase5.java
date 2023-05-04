package ExceptionHandling;

public class ControlFlowTryCatchCase5 {
    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2");
            System.out.println("Stmt-->3");
        }
        catch (ArithmeticException e){
            System.out.println("Stmt-->4");
            System.out.println(e.getMessage());
        }
        System.out.println("Stmt-->5"+(10/0));
    }
}

//Case5: If exception is raised at stmt5, then which  all line of code will be executed?
//Ans: Stmt1,2,3, catch block won't get executed & Abnormal Termination at stmt5 with exception message

