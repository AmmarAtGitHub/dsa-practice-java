import Arrays.BinarySearch; // import the BinarySearch class from the Arrays package
import Arrays.RotatedBinarySearch; // import the RotatedBinarySearch class from the Arrays package
import Arrays.SelectionSort;
import Arrays.BubbleSort; // import the BubbleSort class from the Arrays package
import Arrays.InsertionSort;
public class Main{

    public static void main(String[] args){
        //Binary search
        System.out.println("Running binary search algorithm...");
        BinarySearch.run(); // call the run method to test the binary search algorithm
        System.out.println("Running rotated binary search algorithm...");
        //Rotated binary search
        RotatedBinarySearch.run(); // call the run method to test the rotated binary search algorithm
        System.out.println("All algorithms have been executed.");
        //Bubble sort
        System.out.println("Running bubble sort algorithm...");
        BubbleSort.run(); // call the run method to test the bubble sort algorithm
        //Selection sort
        System.out.println("Running selection sort algorithm...");
        SelectionSort.run(); // call the run method to test the selection sort algorithm
        //Insertion sort
        System.out.println("Running insertion sort algorithm...");
        InsertionSort.run(); // call the run method to test the insertion sort
        //Two Pointer Technique        
        System.out.println("Running Two Pointer Technique");
        TwoPointerTechnique.run(); // Calls the run method to test the two pointer technique algorithm


    }

}
