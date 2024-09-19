package Exception;

public class E3 {
    public static void main(String[] args) {
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println (myNumbers[ 10 ]);
//        }
//        catch (Exception e)
//        {
//            System.out.println ("wrong");
//        }
//        finally {
//            System.out.println ("finished");
//        }
        checkAge (29);
    }

    static void checkAge(int age){
        if (age<18)
        {
            throw new ArithmeticException("Access denied,you must be at least 18 years old");

        }
        else
        {
            System.out.println ("Access granted");
        }
    }
}
