package ExceptionHandling;

public class ControlFlowTryCatchCase2 {
    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2"+(10/0)); //Risky code
            System.out.println("Stmt-->3");
        }
        catch (ArithmeticException e){
            System.out.println("Stmt-->4");
        }
        System.out.println("Stmt-->5");
    }
}

//Case2: If exception is raised at stmt2 & corresponding catch block matched
// then which  all line of code will be executed?
//Ans: Stmt1,4 & 5 catch block won't get executed & Noraml Termination
