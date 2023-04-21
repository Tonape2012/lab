package Array1;

public class ArrayContains {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int value = 3;

	        boolean contains = false;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == value) {
	                contains = true;
	                break;
	            }
	        }

	        if (contains) {
	            System.out.println("Array contains the value " + value);
	        } else {
	            System.out.println("Array does not contain the value " + value);
	        }
	    }
	}

