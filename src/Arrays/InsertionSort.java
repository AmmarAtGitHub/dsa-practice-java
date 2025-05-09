package Arrays;
import java.util.Arrays;
/**
 * InsertionSort.java
 * 
 * Implementation of the Insertion Sort algorithm for integer arrays.
 * 
 * Algorithm:
 * - Builds a sorted array by repeatedly inserting the next unsorted element
 *   into its correct position in the sorted portion of the array
 * - Efficient for small datasets or nearly sorted data
 * - Time Complexity: O(n²) worst-case, O(n) best-case (already sorted)
 * 
 */

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i]; // Element to insert
            int j = i -1; // start comparing with the previous element

            //Shift elements > key to the right
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; //insert the key in the correct position
        }

    }


    //Method to run and test the Selection Sort algorithm
    public static void run(){
        int[] numbers = {5, 2, 4, 6, 1, 3}; 
        System.out.println("Unsorted array: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("Sorted array through insertion sort: " + Arrays.toString(numbers));
    }
}
