import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (b>max && b>c)
        {
            System.out.println("B IS GREATEST");
        }
        else if(c>max && c>b)
        {
            System.out.println("C IS GREATEST");
        }
        else if (max == b && max == c ) {
            System.out.println("ALL ARE EQUAL");
        }
         else

        {
            System.out.println("A IS GREATEST");
        }

    }
}
