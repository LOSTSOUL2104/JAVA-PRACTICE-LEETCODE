import java.util.Scanner;

public class strings_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            StringBuilder sb = new StringBuilder();

            sb.append(s.charAt(0));
            for(int i =1; i<s.length();i++){
                sb.append(s.charAt(i)-s.charAt(i-1));
                sb.append(s.charAt(i));
            }
            System.out.println(sb.toString());
        }
    }

