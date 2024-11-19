//package MULTITHREADING;
//
//public class first {
//    public static void main(String[] args) {
//        int n = 8;
//        for (int i = 0; i < n ; i++) {
//            Thread object = new Thread (new Multi ());
//            object.start ();
//        }
//    }
//}
////
////class Multi extends Thread {
////    public void run() {
////        try {
////            System.out.println ("Thread " + Thread.currentThread ().getId () + " is running rn");
////        }
////        catch (Exception e)
////        {
////            System.out.println ("exception caught");
////        }
////    }
////}
//
// class Multi implements Runnable{
//    public void run() {
//        try {
//            System.out.println ("Thread " + Thread.currentThread ().getId () + " is running");
//        } catch (Exception e){
//            System.out.println ("exception caught");
//        }
//
//    }
//}
