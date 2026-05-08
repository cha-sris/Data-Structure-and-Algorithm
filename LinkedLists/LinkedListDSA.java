package LinkedLists;

import java.util.LinkedList;

public class LinkedListDSA {
    
    //  LinkedList = it consists of nodes and each node has 
    //              a data and pointer to next node in sequence
    //              |Data|Pointer| --> |Data|Pointer|


    public static void main(String[] args) {
        var linkedList = new LinkedList<String>();

        //  LinkedList as Stack
        linkedList.push("A\n");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("\nE");

        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.pop());
        }

        //  LinkedList as Queue
        linkedList.offer("\nA");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
        linkedList.offer("G");

        linkedList.add(3,"H");
        linkedList.remove("D");

        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.poll());
        }
        System.out.println();
    }
}
