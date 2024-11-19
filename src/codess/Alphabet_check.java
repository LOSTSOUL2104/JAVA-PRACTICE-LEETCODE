//import java.util.Scanner;
//
//public class Alphabet_check {
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String input = in.nextLine();
//        char ch = in.next().trim().charAt(n);
//
//        System.out.println(ch);
//    }
//
//}

import java.util.Scanner;

public class Alphabet_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer:");
        while (!in.hasNextInt()) {
            System.out.println("That's not a valid integer. Try again:");
            in.next(); // Consume the invalid input
        }
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character

        System.out.println("Enter a string:");
        String input = in.nextLine();

        if (n >= 0 && n < input.length()) {
            char ch = input.trim().charAt(n);
            System.out.println(ch);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}

