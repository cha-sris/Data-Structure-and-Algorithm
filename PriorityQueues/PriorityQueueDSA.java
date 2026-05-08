package PriorityQueues;

import java.util.*;

public class PriorityQueueDSA {
  //    Priority Queue = A  FIFO data structure that serves elements 
  //                     with the highest priorities first before 
  //                     elements with lower priority  

    public static void main(String[] args) {
        var queue = new LinkedList<Double>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(3.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


        var priQueue = new PriorityQueue<String>(Collections.reverseOrder());

        priQueue.offer("B");
        priQueue.offer("C");
        priQueue.offer("A");
        priQueue.offer("F");
        priQueue.offer("D");

        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.poll());
        }


    }

}
