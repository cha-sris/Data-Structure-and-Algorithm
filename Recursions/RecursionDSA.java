package Recursions;

public class RecursionDSA {
    // Recursion = a method that calls itself inside its own method 
    //              to solve a smaller version of the same problem.

    // Key components:
    // 1. Base case - stops recursion (prevents infinite loop)
    // 2. Recursive case - method calls itself with modified arguments (moving toward base case)

    // Example: factorial(n) = n * factorial(n-1), with base case factorial(0)=1

    // Advantages: elegant for problems with repetitive substructure (trees, divide & conquer)
    // Disadvantages: can be slower, risk of StackOverflowError if too deep

    // Common use cases: tree traversal, Fibonacci, binary search, merge sort, backtracking

    public static void main(String[] args) {
        int num = 7;
        int expo = 2;

        System.out.println("\nFactorial of "+ num + " is " + factorial(num) + "\n");
        System.out.println("" + num + "^" + expo + " = " + power(num,expo) + "\n");
    }

    private static int factorial(int num){
        if( num < 1) return 1; // base case
        
        else return num * factorial(num - 1); // recursion
    }

    private static int power(int num, int expo){
        if (expo < 1) return 1; //  base case

        else return num * power(num,expo - 1);  //  recursion
    }
}
