package Arrays;


public class RotatedBinarySearch {
//method to perform binary search on a rotated sorted array
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

  // Keep searching while left index is less than or equal to right
        while (left <= right) {
            int mid = left + (right - left) / 2; // to prevent integer overflow for large arrays
 // Check if target is found and return 
            if (nums[mid] == target) return mid;
                  // check if the left half is sorted
            if (nums[left] <= nums[mid]) {
            // check if target is in the left half
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
                }
        }
        // Else, th eright half must be sorted
        else {
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
       
        
    }
         // If we exit loop, target was not found
         return -1;
    }


    // Method to run and test the rotated binary search algorithm
    public static void run() {
        // Rotated version of a sorted array
        int[] numbers = {12, 14, 16, 19, 22, 2, 3, 4, 5};

        // Target value to search
        int target = 5;

        // Call the search method
        int result = search(numbers, target);

        // Display the result
        if (result != -1) {
            System.out.println("The target value " + target + " is found at index: " + result);
        } else {
            System.out.println("The target value " + target + " is not found in the array.");
        }
    }

}