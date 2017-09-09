package sorting;

import java.util.Arrays;

public class BubbleSortRecursive {
	static int iterationNumber=0;

	public static void main(String[] args) {
		int arr[] = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		printArray(arr, false);

		bubbleSort(arr, arr.length);

		printArray(arr, true);
	}

	// A function to implement bubble sort recursively
	static void bubbleSort(int arr[], int n)
	{
		// Base case
		if (n == 1)
			return;

		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i=0; i<n-1; i++){
			iterationNumber++;
			if (arr[i] > arr[i+1])
			{
				swapNumbers(i, i+1, arr);
			}
		}

		// Largest element is fixed,
		// recur for remaining array
		bubbleSort(arr, n-1);
	}

	private static void printArray(int[] input, boolean isSorted) {

		String message = "Unsorted array:";
		if(isSorted) {
			message = "Sorted array: \nIterated " + iterationNumber + " times to sort." ;
		}
		System.out.println(message);
		System.out.println(Arrays.toString(input));
		System.out.println("\n");
	}

	private static void swapNumbers(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}