package Arrays;

import java.util.Arrays;

//Selection Sort works by repeatedly finding the minimum element from the unsorted part of the array and moving it to the sorted part.
public class SelectionSort {
    // Method to perform Selection Sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Outer loop - move boundary of the unsorted part
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index has the minimum value
            int minIndex = i;
             // Inner loop - find the actual minimum in the unsorted part
             for (int j = i + 1; j < n; j++) {
                // If a smaller element is found, update minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
              // Swap the found minimum element with the first unsorted element
              int temp = arr[minIndex];
              arr[minIndex] = arr[i];
              arr[i] = temp;
          }
}
// Method to run and test the Selection Sort algorithm
public static void run(){
    int[] numbers = {64, 25, 12, 22, 11};
    System.out.println("Unsorted array: " + Arrays.toString(numbers));
    selectionSort(numbers);
    System.out.println("Sorted array: " + Arrays.toString(numbers));
}
}