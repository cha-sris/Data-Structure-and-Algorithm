package MergeSorts;

public class MergeSortDSA {
    //  Merge Sort = uses divide and conquer algorithm.
    //              recursively divides the array my middle till it can't no more,
    //              sorts the divided array
    //              merges them
    
    //              runtime complexity = O(nlogn) : quasilinear time    
    //              space complexity = O(n)      
    
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        
        System.out.println("\nBefore sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
       
        mergeSort(array);
        
        System.out.println("\nAfter sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) return; // base case
        
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Fill left array
        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        // Fill right array
        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
    }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    //  take leftArray and rightArray and put into array
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }
        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }
        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }

    // private static void merge(int[] leftArray, int[] rightArray, int[] array){
    //     int leftSize = array.length / 2;
    //     int rightSize = array.length - leftSize;
    //     int i = 0, l = 0, r = 0; // indices

    //     //  check conditoin of merging
    //     while(l < leftSize && r < rightSize){
    //         if (leftArray[l] < rightArray[r]) {
    //             array[i] = leftArray[l];
    //             i++;
    //             l++;
    //         }
    //         else{
    //             array[i] = rightArray[r];
    //             i++;
    //             r++;
    //         }
    //     }

    //     //  when only one element left at leftArray
    //     while (l < leftSize) {
    //         array[i] = leftArray[l];
    //         i++;
    //         l++;
    //     }

    //     //  when only one element left at rightArray
    //     while (r < rightSize) {
    //         array[i] = rightArray[r];
    //         i++;
    //         r++;
    //     }
    // }

}
