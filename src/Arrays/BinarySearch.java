package Arrays;

public class BinarySearch{
    //method to perfoem binary search on a sorted array
    public static int search(int[] arr, int target) {
    int left = 0, right = arr.length -1;
    while (left <= right) {
        int mid = left + (right - left) / 2; //  is a safer than (left + right)/2 to calculate the middle index in binary search, especially for large arrays, because it prevents integer overflow.

        if (arr[mid] == target) return mid; // target found as mid index
        else if (arr[mid] < target) left = mid +1;
        else right = mid -1;
    }
    return -1; // the target value was not found in the array
    }

    // Method to run and test the (binary) search algorithm
    public static void run(){
        int[] numbers = {2, 3, 4, 5, 12, 14, 16, 19, 22}; //sorted int array as the binary search algorith works only with sorted arrays
        int target = 5; // the target value to search for in the array
        int result = search(numbers, target); // call the search method to find the target value in the array
        System.out.println("The target value " + target + " is found at index: " + result); // print the result of the search
        // if the target value is not found in the array, the result will be -1
    }


}
        

    

