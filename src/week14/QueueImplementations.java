package week14;

import java.util.*;

public class QueueImplementations {
    public static void main(String[] args) {
        /*
            FIFO -> first in first out
            PriorityQueue orders elements based on natural order (or a custom Comparator).
            offer -> add

         */
        Queue<String> taskQueue = new PriorityQueue<>();
        taskQueue.offer("Write report");
        taskQueue.offer("Attend meeting");
        taskQueue.offer("Fix bugs");
        taskQueue.offer("Code review");

        System.out.println("taskQueue = " + taskQueue);
        System.out.println("First item : " + taskQueue.peek());
        System.out.println("First item completed : " + taskQueue.poll());

        System.out.println("\nProcessing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println("- " + taskQueue.poll()); // retrieves and removes head
        }

        System.out.println("----ArrayDeque----");

        Queue<String> customerQueue = new ArrayDeque<>();
        //Diana, Alice, Bob, Charlie
        customerQueue.offer("Diana");
        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");
        System.out.println(customerQueue);
        System.out.println("First = " + customerQueue.peek());
        System.out.println("\nServing customers:");
        while (!customerQueue.isEmpty()) {
            System.out.println("- Serving " + customerQueue.poll());
        }
    }
}