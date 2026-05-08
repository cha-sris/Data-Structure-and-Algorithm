package LinearSearches;

public class LinearSearchDSA {
    
    //  linear search = Iterate through a collection one element at a time

    //  runtime complexity O(n)

    //  Disadvantages: Slow for large data sets

    //  Advantages: Fast for searches of small to medium searches
    //              Does not need to be sorted
    //              Useful for data structures that do not have random access (Linked List)

    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int value = 7;
        int index = linearSearch(array, value);

        System.out.println();
        if(index == -1){
            System.out.println(value + " is not found in the array.");
        }
        else {
            System.out.println("Found the " + value + " at index: " + index);
        }

        System.out.println();
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}
