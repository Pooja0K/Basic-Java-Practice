package ExceptionHandling;

public class ControlFlowTryCatchCase4 {
    public static void main(String[] args) {
        try{
            System.out.println("Stmt-->1");
            System.out.println("Stmt-->2");
            System.out.println("Stmt-->3"+(10/0));//Risky code
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            String s=null;
            System.out.println("Stmt-->4"+(s.length())); //Risky code
        }
        System.out.println("Stmt-->5");
    }
}

//Case4: If exception is raised at stmt4 , then which  all line of code will be executed?
//Ans: Either due to stmt1, 2, or 3 Exception will be raised that is why control would goto catch black so either of these line
//might not get executed but as per above code stmt 1,2 followed by exception message
//  catch block also won't get executed as exception occurred & Stmt5 (remaining code) won't get executed
// as exception is not handled inside catch black so Abnormal Termination



