package Array1;
public class CommonElements {
	 public static void main(String[] args) {
	        int[] arr1 = {1, 3, 4, 6, 7, 9};
	        int[] arr2 = {1, 2, 4, 5, 9, 10};
	        int[] arr3 = {1, 4, 7, 8, 9, 11};

	        int i = 0, j = 0, k = 0;

	        while (i < arr1.length && j < arr2.length && k < arr3.length) {
	            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	                System.out.println(arr1[i]);
	                i++;
	                j++;
	                k++;
	            } else if (arr1[i] < arr2[j]) {
	                i++;
	            } else if (arr2[j] < arr3[k]) {
	                j++;
	            } else {
	                k++;
	            }
	        }
	    }
	}

