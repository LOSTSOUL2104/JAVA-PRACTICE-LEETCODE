import java.util.Scanner;


public class counting_occurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBER : ");
        int n = in.nextInt();
        System.out.println("ENTER THE CHARACTER FOR CHECKING OCCURENCE : ");
        int occurence = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == occurence)
            {
                count++;
            }
             n = n/10;
        }
        System.out.println(count);
    }
}
