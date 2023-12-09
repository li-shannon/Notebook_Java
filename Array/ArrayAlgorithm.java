
public class ArrayAlgorithm {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		fillWithRandomNumbers(numbers, 10, 99);
		printArray(numbers);
		
		System.out.println("Maximum value in the array [numbers]: " + findMax(numbers));
		System.out.println("minimum value in the array [numbers]: " + findMin(numbers));
		System.out.println("Sum of all numbers in the array [numbers]: " + calculateSum(numbers));
		System.out.println("Average of all numbers in the array [numbers]: " + calculateAverage(numbers));
		
	}
	
	/**
	 * Fills an array with random integers between two given numbers.
	 * @param array the array to be filled
	 * @param a the lower limit of the integer range (inclusive)
	 * @param b the upper limit of the integer range (exclusive)
	 */
	public static void fillWithRandomNumbers(int[] array, int a, int b) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (b - a + 1)) + a;
		}
	}
	
	/**
	 * Prints the elements in an array
	 * @param array the array to be printed
	 */
	public static void printArray(int[] array) {
		for(int element: array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	/**
	 * Computes the sum of all values in an array.
	 * @param array the array to be processed
	 * @return the sum of all values
	 */
	public static int calculateSum(int[] array) {
		int sum = array[0];
		for(int i = 1; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	/**
	 * Computes the average of all values in an array.
	 * @param array the array to be processed
	 * @return the average of all values
	 */
	public static double calculateAverage(int[] array) {
		int sum = calculateSum(array);
		double average = sum * 1.0 / array.length;
		return average;
	}	
	
	/**
	 * Finds the maximum value in an array.
	 * @param array the array to be processed
	 * @return the maximum value in the array
	 */
	public static int findMax(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	/**
	 * Finds the minimum value in an array.
	 * @param array the array to be processed
	 * @return the minimum value in the array
	 */
	public static int findMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}

