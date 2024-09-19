import java.util.Scanner;

public class PRACTICE_1 {
    //    Gross salary of an employee
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
//        int number = in.nextInt ();
//        increment_by_one (number);


        }
//        int bs = in.nextInt ();
//        gross_sal(bs);
//        INCREMENT BY 1 TO ALL DIGITS
    }
    public static void gross_sal(int bs){

        float hra,da,total;
        if(bs<= 10000){
            hra = bs*0.2f;
            da = bs*0.8f;
        } else if (bs>10000 || bs<20000) {
            hra = bs * 0.25f;
            da = 0.9f*bs;
        } else {
            hra = bs*0.3f;
            da = 0.95f*bs;
        }
        System.out.println ("The gross salary is  : " + (bs + hra + da));
    }

    public static void increment_by_one(int number){
        int add = 1;
        for (int i = 0; i <String.valueOf (number).length () ; i++) {
            number+=add;
            add *=10;
    }
        System.out.println (number);
}

public  static int Kaprekar(int num){
    if (num == 1)
    {
        return 1;
    }
    int square = num * num;
    int numdDigits = 0;
    int temp = num;
    while(temp != 0)
    {
        numdDigits++;
        temp /= 10;
    }
    int divisor = (int)Math.pow(10,numdDigits);
    int left= square/divisor;
    int right = square%divisor;
    return (left + right == num)? 1:0;
}

public static boolean Prime_1toN(int n){
    if (n == 1 || n ==0)
    {
        return false;
    }
    for (int i = 2; i <n ; i++) {
        if (n%i == 0)
        {
            return false;
        }
    }
    return true;
}

public void main() {
//    int N = 100;
//    //check for every number from 1 to N
//    for(int i=1; i<=N; i++){
//        //check if current number is prime
//        if(Prime_1toN (i)) {
//            System.out.print(i + " ");
//        }
//    }
//    System.out.println (Kaprekar (45));
}




