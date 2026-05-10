package SelectionSorts;

public class SelectionSortDSA {
    //  Selection Sort = search through an array and keep track of the minimum value
    //                   during each iteration. At the end of each iteration, 
    //                   we swap variables.

    //                   Quadratic time O(n^2)
    //                   small data set = okay
    //                   large data set = bad

    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        
        System.out.println("\nBefore sort: ");
        
        for(int i : array){
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        
        selectionSort(array);

        System.out.println("\nAfter sort: ");
        for(int i : array){
            System.out.print(i + "\t");
        }

        System.out.println("\n");
    }

    private static void selectionSort(int[] array){
        
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if(min != i){
                System.out.printf("Pass %d: swap %d with %d%n", i, array[i], array[min]);
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }
    }
}
