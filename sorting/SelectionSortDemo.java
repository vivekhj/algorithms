package sorting;

import java.util.Arrays;

public class SelectionSortDemo {

	static int iterationNumber=0;
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		printArray(input, false);

		selectionSort(input);

		printArray(input, true);
	}

	public static void selectionSort(int[] arr) {
		int i, j, minIndex;
		int n = arr.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++) {
				iterationNumber++;
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			if (minIndex != i) {
				swapNumbers(i, minIndex, arr);
			}
		}
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
