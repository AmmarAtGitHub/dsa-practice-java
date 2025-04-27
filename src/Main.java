import Arrays.BinarySearch; // import the BinarySearch class from the Arrays package
import Arrays.RotatedBinarySearch; // import the RotatedBinarySearch class from the Arrays package
import Arrays.BubbleSort; // import the BubbleSort class from the Arrays package
public class Main{

    public static void main(String[] args){
        System.out.println("Running binary search algorithm...");
        BinarySearch.run(); // call the run method to test the binary search algorithm
        System.out.println("Running rotated binary search algorithm...");
        RotatedBinarySearch.run(); // call the run method to test the rotated binary search algorithm
        System.out.println("All algorithms have been executed.");
        System.out.println("Running bubble sort algorithm...");
        BubbleSort.run(); // call the run method to test the bubble sort algorithm
    }

}