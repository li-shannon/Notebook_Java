
public class ArrayAlgorithm {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		fill(numbers, 10, 99);
		printArray(numbers);
		
		reverse(numbers);
		printArray(numbers);
		
		System.out.printf("%-10s%5d\n", "Maximum: ", findMax(numbers));
		System.out.printf("%-10s%5d\n", "Minimum: ", findMin(numbers));
		System.out.printf("%-10s%5d\n", "Sum: ", calculateSum(numbers));
		System.out.printf("%-10s%5.2f\n", "Average: ", calculateAverage(numbers));
		
	}
	
	/**
	 * Fills an array with random integers between two given numbers.
	 * @param array the array to be filled
	 * @param a the lower limit of the integer range (inclusive)
	 * @param b the upper limit of the integer range (inclusive)
	 */
	public static void fill(int[] array, int a, int b) {
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
	
	/**
	 * Reverses the order of elements in an array.
	 * @param array the array to be reversed
	 */
	public static void reverse(int[] array) {
		int temp = 0;
		for(int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}
}

