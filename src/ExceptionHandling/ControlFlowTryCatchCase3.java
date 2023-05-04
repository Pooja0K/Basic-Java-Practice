package ExceptionHandling;

import java.io.IOException;

public class ControlFlowTryCatchCase3 {

    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2"+(10/0)); //Risky code
            System.out.println("Stmt-->3");
        }
        catch (NullPointerException e){
            System.out.println("Stmt-->4");
        }
        System.out.println("Stmt-->5");
    }
}

//Case3: If exception is raised at stmt2 & corresponding catch block not matched
// then which  all line of code will be executed?
//Ans: Stmt1 catch block & Stmt5 won't get executed & Abnormal Termination
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling.ControlFlowTryCatchCase3.main(ControlFlowTryCatchCase3.java:10)

