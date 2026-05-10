package InsertionSorts;

public class InsertionSortsDSA {
    //  Insertion Sort = after comparing the elements to the left
    //                  shift elements to the right to make room to insert a value

    //                  Quadratic time O(n^2)
    //                  small data set = decent
    //                  large data set = BAD
    
    //                  less steps than bubble sort
    //                  Best case in O(n) compared to Selection Sort O(n^2)

    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        System.out.println("\nBefore sort:");

        for(int i : array){
            System.out.print(i + "\t");
        }

        System.out.println("\n");

        insertionSort(array);
        System.out.println("\nAfter sort:");

        for(int i : array){
            System.out.print(i + "\t");
        }

        System.out.println();
    }

    private static void insertionSort(int[] array){

        //  When i = 0, there are no elements to the left to compare with or shift. so we use i = 1
        //  Two conditions in while loop because j starts at i - 1 and decreases (j--),
        //  and accessing array[j] with a negative index crashes the program.
        
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;  //  to the left

            while (j >= 0 && array[j] > temp) { //  shifting to right
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp; // insert min value at left after done shifting
        }
    }
}
