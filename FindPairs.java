package Array1;

public class FindPairs {
	public static void main(String[] args) {

        int[] array = { 3, 5, 2, 8, 6, 10 };
        int targetSum = 11;

        findPairs(array, targetSum);

    }

    public static void findPairs(int[] array, int targetSum) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == targetSum) {

                    System.out.println("(" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }








}
