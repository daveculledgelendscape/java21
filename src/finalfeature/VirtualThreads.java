package finalfeature;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Generated Copilot Java program that compares the speed of virtual threads and platform threads by running a large number of tasks and measuring execution time.
 */
public class VirtualThreads {
  private static final int TASK_COUNT = 100_000; // Number of tasks to execute

  public static void main(String[] args) {
    System.out.println("Comparing Virtual Threads vs Platform Threads Performance...\n");

    // Measure execution time for Platform Threads
    measureExecutionTime("Platform Threads", Executors.newFixedThreadPool(100));

    // Measure execution time for Virtual Threads
    measureExecutionTime("Virtual Threads", Executors.newVirtualThreadPerTaskExecutor());
  }

  private static void measureExecutionTime(String threadType, ExecutorService executor) {
    Instant start = Instant.now();

    for (int i = 0; i < TASK_COUNT; i++) {
      executor.submit(() -> {
        // Simulate a lightweight task
        try {
          Thread.sleep(10); // Simulating I/O or network delay
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      });
    }

    executor.shutdown();
    while (!executor.isTerminated()) {
      // Wait for all tasks to finish
    }

    Instant end = Instant.now();
    System.out.println(threadType + " execution time: " + Duration.between(start, end).toMillis() + " ms");
  }
}