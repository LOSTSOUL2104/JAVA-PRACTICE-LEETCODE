import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("ENTER YOU NAME : ");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
        System.out.println("ENTER A : ");
        int a = in.nextInt();
        System.out.println("ENTER B : ");
        int b = in.nextInt();
        swap(a,b);
        System.out.println(a + " " + b);
    }

    static String mygreet(String name) {
        String message = "Hello MR Nigga " + name;
        return message;
    }
    static void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
