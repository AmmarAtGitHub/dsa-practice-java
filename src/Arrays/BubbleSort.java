public class BubbleSort {

    public static void bubbleSort(int[] array) {
        // Get the length of the array
        int n = array.length;
        
        // Outer loop: controls number of passes through the array
        // We need n-1 passes to sort n elements
        for (int i = 0; i < n - 1; i++) {
            
            // Inner loop: performs comparisons and swaps
            // After each pass, the largest element bubbles to the end,
            // so we can reduce the number of comparisons each time
            for (int j = 0; j < n - i - 1; j++) {
                
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap elements if they're in wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}