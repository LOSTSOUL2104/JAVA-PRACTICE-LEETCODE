import java.util.*;
public class class_3{
    public static void main(String[] args) {
        try{
            int[] arr = new int[10];
            arr[6] = 100;
            int res = 100/10;

            throw new ArithmeticException("PALAK=BISHT");
            //System.out.println("code after exception");
        }

        // catch(ArithmeticException e) {
        //     System.out.println("ArithmeticException : e.getMessage()");
        // }


        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("finally block");
        }

        System.out.println("code run");
    }
}