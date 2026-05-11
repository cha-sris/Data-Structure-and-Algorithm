package QuickSorts;

public class QuickSortDSA {

    // QuickSort = divide & conquer algorithm.
    // Pick a pivot (here: last element). Partition the array so that:
    // - left side contains elements < pivot
    // - pivot is in its final sorted position
    // - right side contains elements >= pivot
    // Recursively sort left and right subarrays.
    //
    // Time complexity: O(n log n) average, O(n²) worst case
    // Space complexity: O(log n) for recursion stack

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        System.out.println("\nBefore sort:");

        for (int i : array) {
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println("\nAfter sort:");

        quickSort(array, 0, array.length -1);

        for (int i : array) {
            System.out.print(i + "\t");
        }

        System.out.println("\n");

    }

    private static void quickSort(int[] array, int start, int end) {
        
        if(start >= end) return; // base case

        int pivot = partition(array,start, end);
        quickSort(array, start, pivot -1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++){
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    
}
