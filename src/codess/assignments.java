import java.util.Scanner;

public class assignments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//     int a = input.nextInt();
//     int b = input.nextInt();
//     int c = input.nextInt();
//     max(a,b,c);
//     min(a,b,c);
    pattern(5);
    }
//    static void max(int a,int b,int c)
//    {
//        if (a>b && a>c)
//        {
//            System.out.println(a + " is greatest");
//        } else if (b>a && b>c) {
//            System.out.println(b + " is greatest");
//        }
//        else if (c>a && c>b) {
//            System.out.println(c + " is greatest");
//        }
//    }
//    static void min(int a,int b,int c)
//    {
//        if (a<b && a<c)
//        {
//            System.out.println(a + " is smallest");
//        } else if (b<a && b<c) {
//            System.out.println(b + " is smallest");
//        }
//        else if (c<a && c<b) {
//            System.out.println(c + " is smallest");
//        }
//    }



    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
