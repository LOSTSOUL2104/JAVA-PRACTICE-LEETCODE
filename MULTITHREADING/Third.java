package MULTITHREADING;

class myRunnable implements Runnable
{
    public void run()
    {
        for (int i = 0; i <=10 ; i++) {
            System.out.println (Thread.currentThread ().getName () + ":" + i);
            try
            {
                Thread.sleep (500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace ();
            }
        }
    }
}
public class Third {
    public static void main(String[] args) {
//        Thread t1 = new Thread (new myRunnable (),"Thread 1");
//        Thread t2 = new Thread (new myRunnable (),"thread 2");
//
//        t1.start ();
//        t2.start ();
//        CQ t = new CQ();
//        t.start();
//
//        CQ2 cq1 = new CQ2 ();
//        Thread thread = new Thread(cq1);
//        thread.start();
//        try
//        {
//            thread.join();
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//        System.out.print("Get better at ");
//        System.out.println("Coding.");

        CQ3 cq1 = new CQ3();
        cq1.start();
    }}


class CQ extends Thread
{
    public void run()
    {
        System.out.println("CodeQuotient");
    }
}
class CQ2 implements Runnable {
    public void run() {
        System.out.print ("Code ");
        System.out.print ("Quotient ");
    }
}
class CQ3 extends Thread implements Runnable
{
    public void run()
    {
        System.out.println(this.getState());
        System.out.println("Code Quotient");
    }
}
