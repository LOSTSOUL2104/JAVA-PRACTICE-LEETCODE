package MULTITHREADING;

public class Second {
    public static void main(String[] args) {


//    multii func1 = new multii ();
//    func1.start();
//    multii func2 = new multii ();
//    func2.start();

//        Mythread t1 = new Mythread ();
//        t1.start ();

  T1 obj = new T1();
  Thread t = new Thread (obj);
  t.start ();
    }
}
//CODE FOR EXTENDS
class multii extends Thread{
    public void run(){
        System.out.println ("thread running");
    }
}
class Mythread  extends Thread{
    public void run()
    {
        int i =0 ;
        while (i<40)
        {
            System.out.println ("My thread is running");
            System.out.println ("yayyyy");
            i++;
        }
    }
}
//CODE FOR RUNNABLE

class T1 implements Runnable{
    @Override
    public void run() {
        System.out.println ("Thread running");
    }
}