package Array1;
import java.util.*;
public class FindDuplicates {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 5, 4};

	        // Create a HashSet to store the unique elements
	        Set<Integer> uniqueElements = new HashSet<>();
	        // Create a HashSet to store the duplicate elements
	        Set<Integer> duplicateElements = new HashSet<>();

	        for (int i = 0; i < arr.length; i++) {
	            // If the element is already in the uniqueElements set, it is a duplicate
	            if (!uniqueElements.add(arr[i])) {
	                duplicateElements.add(arr[i]);
	            }
	        }

	        System.out.println("Duplicate elements in the array: " + duplicateElements);
	    }
	
}
