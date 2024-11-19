import java.util.Scanner;

public class strings_3 {
        public static void main(String[] args) {

            StringBuilder str = new StringBuilder ("hello");
            str.append (" world");
            System.out.println (str);
//            str.reverse();
            str.setCharAt (0,'m');
            System.out.println (str);
    str.insert(2,'y');
            System.out.println (str);
            str.deleteCharAt (2);
            System.out.println (str);
            }
        }
