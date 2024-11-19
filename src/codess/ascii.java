package codess;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence/wor: ");
        String sentence = in.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt (i);
            int asciiValue = (int) character;
            System.out.print (asciiValue);
        }
        System.out.println (" ");
        System.out.println ("enter your ascii value :");
        int ascii = in.nextInt ();
        char charr = (char) ascii;
        System.out.println (charr);

    }
}
