package BinarySearches;

import java.util.Arrays;

@SuppressWarnings("unused")
public class BinarySearchDSA {

//  Binary Search = finds target in SORTED array by repeatedly dividing search space in half
//  
//  Time Complexity: O(log n) - extremely efficient for large datasets
//  Space Complexity: O(1) - iterative, no extra memory
//  
//  How it works:
//  1. Compare target with middle element
//  2. If target < middle → search LEFT half (discard right)
//  3. If target > middle → search RIGHT half (discard left)
//  4. Repeat until found or no elements remain
//  
//  Returns: index if found, -1 if not found
//  Note: Arrays.binarySearch() from java.util provides built-in implementation

    public static void main(String[] args) {
        int array[] = new int[10000000];
        int target = 3228493;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println();

        //  using package
        // int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found in the array.");
        }
        else{
            System.out.println("Found at index: " + index);
        }

        System.out.println();

    }

    
    private static int binarySearch(int array[], int target){
        int low = 0;
        int high = array.length - 1;
        int count = 1;

        while(low <= high){
            int middle = low + (high - low)/2;
            int value = array[middle];

            if(value > target){
                // high - middle;
                high = middle - 1;
            }
            else if (value < target) {
                low = middle + 1;
            }
            else{
                return middle;
            }

            System.out.println("Iteration: " + count + " | Target: " + target);
            System.out.println("Low: " + low + " | Middle: " + middle + " | High: " + high);
            count++;
        }

        return -1;
    }
}
