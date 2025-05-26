public class TwoPointerTechnique {

    // Method to check if a pair with the given sum exists in a sorted array
    public static boolean hasPairWithSum(int[] arr, int target) {
        // Initialize two pointers: one at the start and one at the end
        int left = 0;
        int right = arr.length - 1;

        // Loop until the two pointers meet
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true; // Pair found
            } else if (sum < target) {
                left++; // Move left pointer to increase the sum
            } else {
                right--; // Move right pointer to decrease the sum
            }
        }

        // No pair found with the given sum
        return false;
    }

    // Method to run and test the Two Pointer Technique
    public static void run() {
        int[] numbers = {1, 2, 4, 6, 10}; 
        int target = 8;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target Sum: " + target);

        boolean result = hasPairWithSum(numbers, target);

        if (result) {
            System.out.println(" Pair with the target sum exists.");
        } else {
            System.out.println(" No pair with the target sum found.");
        }
    }

}
