import java.util.Scanner;
//lowercase to uppercase
//uppercase to lowercase
public class string_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        StringBuilder str = new StringBuilder (in.nextLine ());
        System.out.println (str);
        for (int i = 0; i <str.length () ; i++) {
            boolean flag = true;
            char ch = str.charAt (i);
            if (ch ==' ')
            {
                continue;
            }
            int ascii = (int) ch;
            if (ascii >=97)
            {
                flag = false;
            }
            if (flag == true)
            {
                ascii += 32;
                char dh=(char)ascii;
                str.setCharAt (i,dh);
            }
            else
            {
                ascii -= 32;
                char dh = (char) ascii;
                str.setCharAt (i,dh);
            }
        }
        System.out.println (str);
    }
}
