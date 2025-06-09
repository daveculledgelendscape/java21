package finalfeature;

import java.util.concurrent.atomic.AtomicInteger;

public class VirtualThreads implements Runnable {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Hello from " + Thread.currentThread().getName());

    // Platform Thread
    Thread t = new Thread(new Runnable() {
      public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
      }
    });
    t.start();

    Thread.ofVirtual().start(new VirtualThreads());

    // Need to keep this thread running until the virtual thread has run
    Thread.sleep(500);
  }

  @Override public void run() {
    System.out.println("Hello world!");
  }

}
