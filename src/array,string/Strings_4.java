import java.util.Scanner;

public class Strings_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter the letter to remove: ");
        char letterToRemove = scanner.next().charAt(0);
        String modifiedString = originalString.replace(String.valueOf(letterToRemove), "");

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);


        scanner.close();
        System.out.println (ispalindrome (modifiedString));
    }

    static int reverse(int n)
    {
        int rev = 0;
        int rem;
        while(n>0)
        {
            rem = n%10;
            rev = (rev*10) + rem;
            n /= 10;
        }
        return rev;
    }
    static boolean ispalindrome(String str)
    {
        if (str == null || str.length() == 0)
        {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <str.length() / 2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end)
            {
                return false;
            }
        }
        return true;
    }
}



