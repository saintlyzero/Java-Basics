/**
 * RunnableThread
 */

class MultiThreading implements Runnable {
 
     public void run() {
        try {
            long threadId = Thread.currentThread().getId();
            System.out.println("Thread "+threadId+ " is running");
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }
 }
public class RunnableThread {

    public static void main(String[] args) {
        int threadCount = 5;

        for (int i = 0; i < threadCount; i++) {
            
            Thread object = new Thread(new MultiThreading()); 
            object.start(); 
        }
    }
}