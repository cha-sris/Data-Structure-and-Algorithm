package BubbleSorts;

public class BubbleSortDSA {
    

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 7, 4, 9, 2, 8, 6};

        bubbleSort(array);

        System.out.println();

        for(int i : array){
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println();
    }

    private static void bubbleSort(int[] array) {
        
        //  for(each element as "sorted count"){
        //      for(traverse the unsorted portion){
        //          compare adjacent elements;
        //          if left > right → swap;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
