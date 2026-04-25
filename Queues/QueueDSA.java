package Queues;

import java.util.LinkedList;

public class QueueDSA {
   //   Queue = FIFO data structure. First-In First-Out (eg. a line of people)
   //           A collection designed for holding elements prior to processing Linear data structure

   //           add = enqueue, offer()
   //           remove = dequeue, poll()
   //           getFirst() = returns the element at front node
   //           getLast() = returns the element at the last end
   //           isEmpty() = returns true is queue is empty
   //           size() = returns total number of elements in queue

   //   Use cases:
   //   1. Keyboard Buffer -> letters should appear on the screen in the order they are pressed
   //   2. Printer Queue -> print jobs should be completed in order
   //   3. Used in LinkedList, PriorityQueues, Breadth-first search

   public static void main(String[] args) {
        var queue = new LinkedList<String>();

        System.out.println("\n" + queue.size());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println("First in queue " + queue.getFirst());    
        System.out.println("Last in queue " + queue.getLast() + "\n");

        queue.offerFirst("Charles");
        queue.offer("Pablo");
        queue.offerLast("Harry");

        System.out.println(queue);
        
        System.out.println(queue.poll());
        System.out.println(queue);
        
        System.out.println(queue.pollLast());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println();

    }
}
