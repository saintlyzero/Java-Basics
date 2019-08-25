/**
 * EvenOdd
 */

 /**
  * MultiThreading
  */
import java.util.*;

 class MultiThreadingEvenOdd implements Runnable{
 
    private static boolean evenFlag = true;
    public static  Vector<Integer> vec = new Vector<Integer>();


    public synchronized void run() {
        if (evenFlag == true) {
            printEven();
        } else {
           printOdd();
        }
    }

    public void printEven() {
        long threadId = Thread.currentThread().getId();
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i+" ~ Thread "+threadId);
        }
        evenFlag = false;
    }

    public  void printOdd() {
        long threadId = Thread.currentThread().getId();
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i+" ~ Thread "+threadId);
        }
        evenFlag = true;
    }
 }
public class EvenOdd {

    public static void main(String[] args) {
        
        MultiThreadingEvenOdd multiThreading = new MultiThreadingEvenOdd();
        Thread thread1 = new Thread(multiThreading);
        Thread thread2 = new Thread(multiThreading);
        thread1.start();
        thread2.start();
    }
    
}