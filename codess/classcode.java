public class classcode {

    public static void main(String[] args) {
        mythread mt1 = new mythread (); mt1.start ();

        runnablethread rt = new runnablethread (); Thread th = new Thread (rt);

        th.start ();

        runnablethread rt1 = new runnablethread (); Thread th1 = new Thread (rt1);

        th1.start ();
    }
}

class mythread extends Thread {

    public void run() {

        System.out.println ("custom thread");
    }
}

class runnablethread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println ("value of  is " + i);

        }

    }

}
