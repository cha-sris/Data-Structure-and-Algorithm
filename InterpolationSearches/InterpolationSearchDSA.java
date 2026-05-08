package InterpolationSearches;

public class InterpolationSearchDSA {
    //  Interpolation search = improvement over binary search used for "uniformly" distributed
    //                          "guesses" where a value might be based on calculated probe results
    //                          if probe is incorrect, search area is narrowed, and new probe is calculated
    
    //                          average-case: O(log(logn))
    //                          worst-case: O(n) [values increase exponentially]         
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 2;

        int index = interpolationSearch(array, target);

        System.out.println();

        if(index != -1){
            System.out.println(target + " found at " + (index + 1));
        }
        else{
            System.out.println(target + " is not in the array.");
        }

        System.out.println();
    }

    private static int interpolationSearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        int count = 1;

        while(target >= array[low] && target <= array[high] && low <= high){

            // low = 0 (starting index)
            // high = 8 (ending index)
            // width = high - low = 8 positions (indices 0 through 8)

            // Array visualization:
            // [0] [1] [2] [3] [4] [5] [6] [7] [8]
            //  ↑                               ↑
            // low (0%)                         high (100%)

            // percentage = distance / totalRange = 7 / 8 = 0.875 (87.5%)
            // offset = width × percentage = 8 × 0.875 = 7 positions from low
            // probe = low + offset = 0 + 7 = 7

            // probe = low + [ (width × distance) / totalRange ]
            // int probe = low + ((high - low) * (target - array[low]))/ (array[high] - array[low]);


            //  think of it as what percentage of total range does the target cover?
            //  got the answer? but we need it in index so we mulitply [ (range of index) x percentage]
            //  but why + low, because the formula was expanded (low + high) / 2 and the reason for that
            //                  is very large numbers like 4 billion goes out of range of int

            int width = high - low;
            int distance = target - array[low];
            int totalRange = array[high] - array[low];

            int probe = low + ((width * distance) / totalRange);

            System.out.println();
            System.out.println("Iteration: " + count + " | Target: " + target);
            System.out.println("Low: " + low + " | Middle: " + probe + " | High: " + high);
            count++;

            if(array[probe] == target){
               return probe;
            }    
            else if(array[probe] < target){
                low = probe + 1;
            }        
            else{
                high = probe - 1;
            }            
        }

        return -1;

        
    }
}
