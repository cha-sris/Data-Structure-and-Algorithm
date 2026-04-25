package Stacks;

import java.util.Stack;

public class StacksDSA {
    //  Stack = LIFO data structures, Last-In First-Out.
    //          stores objects into a sort of vertical tower.
    //          push() to add to the top
    //          pop() to remove from the top
    //          peek() to peek at top element
    //          isEmpty() returns true is stack has no element

    //  Uses of stack:
    //  1. undo/redo features in text editors
    //  2. moving back/forward through browser history
    //  3. backtracking algorithms (maze, file directories)
    //  4. calling functions (call stack)

    public static void main(String[] args) {
        var stack = new Stack<String>();
        
        System.out.println(stack.isEmpty());
        
        stack.push("CSIT"); // gets popped out at last
        stack.push("BIT");
        stack.push("BCA");
        stack.push("BICTE");
        stack.push("BBA"); // at top, gets popped out at first

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
