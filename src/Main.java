import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        int max = a;
//
//        if (b>max && b>c)
//        {
//            System.out.println("B IS GREATEST");
//        }
//        else if(c>max && c>b)
//        {
//            System.out.println("C IS GREATEST");
//        }
//        else if (max == b && max == c ) {
//            System.out.println("ALL ARE EQUAL");
//        }
//         else
//
//        {
//            System.out.println("A IS GREATEST");
//        }
//
//    }
//        Scanner in = new Scanner (System.in); int n = 5; int totalMarks = n * 100; int sumOfMarks = 0;
//
//        for (int i = 1; i <= n; i++) {
//            int marks = in.nextInt (); sumOfMarks += marks;
//        }
//
//        double percentage = (double) sumOfMarks / totalMarks * 100;
//        int flooredPercentage = (int) Math.floor (percentage);
//
//        System.out.print (sumOfMarks + " "); System.out.print (flooredPercentage);
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int originalNumber = number;
        int add = 1;
        int length = String.valueOf(originalNumber).length();
        for (int i = 0; i < length; i++) {
            number += add;
            add *= 10;
        }
        System.out.println(number);
    }
}
