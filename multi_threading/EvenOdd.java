/**
 * EvenOdd
 */

 /**
  * MultiThreading
  */

  class MultiThreadingEvenOdd implements Runnable{
 
    private static boolean evenFlag = true;
  
    public synchronized void run() {
        if (evenFlag == true) {
            evenFlag = false;
            printEven();
        } else {
           printOdd();
        }
    }

    public void printEven() {
        long threadId = Thread.currentThread().getId();
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i+"\t~ Thread_id "+threadId);
        }
    }

    public  void printOdd() {
        long threadId = Thread.currentThread().getId();
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i+"\t~ Thread_id "+threadId);
        }
        evenFlag = true;
    }
 }
public class EvenOdd {

    public static void main(String[] args) {
        
        MultiThreadingEvenOdd multiThreading = new MultiThreadingEvenOdd();
        Thread evenThread = new Thread(multiThreading);
        Thread oddThread = new Thread(multiThreading);
        evenThread.start();
        oddThread.start();
    }
    
}