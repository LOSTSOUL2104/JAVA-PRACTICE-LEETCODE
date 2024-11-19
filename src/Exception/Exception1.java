package Exception;

public class Exception1 {
    public static void main(String[] args) {
        int a  = 5;
        int b  = 0;
        try
        {
//            divide (a,b);
            throw new Exception ("just for fun");
        }
        catch (Exception e)
        {
            System.out.println ("normal");
        }
        finally {
            System.out.println ("this part always runs");
        }
    }
    static int divide(int a,int b) throws ArithmeticException
    {
        if (b ==0)
        {
            throw new ArithmeticException("no divide by 0");
        }
        return a/b;
    }
}
