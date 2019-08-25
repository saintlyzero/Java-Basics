class MultiThreading1 implements Runnable {
 
    public void run() {
       try {
           long threadId = Thread.currentThread().getId();
           System.out.println("Thread "+threadId+ " is running");
           commonResource();
       } 
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }

    public static synchronized void commonResource() {
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enters this
        }
    }
}

public class LifeCycleThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MultiThreading1()); 
        Thread thread2 = new Thread(new MultiThreading1()); 

        System.out.println("STATE: "+thread1.getState()); // State : NEW

        thread1.start();  
        thread2.start();  

        System.out.println("STATE: "+thread1.getState()); // State : RUNNABLE

        Thread.sleep(3000);

        System.out.println("STATE: "+thread2.getState()); // State : RUNNABLE/BLOCKED


    }
}