import java.util.Scanner;

public class Bank {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            int amnt = in.nextInt ();
            BankFee b1 = new BankFee(amnt);
            b1.showFee();
        }
    }

    class BankFee{
        private double withdrawAmount;
        private double fee;

        BankFee(double withdrawAmount){
            this.withdrawAmount = withdrawAmount;
            calculateFee(this.withdrawAmount);
        }

        private void calculateFee(double withdrawAmount){
            this.fee = 0.1*withdrawAmount;
        }
        void showFee(){
            System.out.println("withdrawl amount is : " + withdrawAmount);
            System.out.println("fee amount is : " + fee);
        }
    }

