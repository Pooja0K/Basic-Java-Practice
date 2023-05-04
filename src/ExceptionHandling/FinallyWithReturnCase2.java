package ExceptionHandling;

public class FinallyWithReturnCase2 {

    public static String m1() {
        try {

            return "Try";  //return is called in try
        }
        catch (Exception e){

            return "Catch Exception" ; //return is called in Catch
        }
        finally {

            return "Finally";  //return is called in Finally
        }
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }

  }

//In above program try blocked is executed, now when return statement is encountered inside try
// then JVM will check if there is any finally block or not for above class, if finally block is present
// then finally block will be executed first and after that other statement/line will not be executed
// Therefore Output of the program  is Finally





