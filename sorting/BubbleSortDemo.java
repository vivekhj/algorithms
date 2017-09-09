package sorting;

import java.util.Arrays;

public class BubbleSortDemo {

	static int iterationNumber=0;
	
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		printArray(input, false);
		usualBubbleSort(input);
		printArray(input, true);
		
		iterationNumber=0;
		int[] input2 = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		printArray(input2, false);
		efficientBubbleSort(input2);
		printArray(input2, true);
		
	}

	public static void efficientBubbleSort(int[] arr) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < arr.length - j; i++) {  
				iterationNumber++;
				if (arr[i] > arr[i + 1]) {                          
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swapped = true;
				}
			}                
		}
	
	}

	private static void usualBubbleSort(int[] input) {
		for(int i=0; i<=input.length-1; i++) {
			for(int j=0; j<input.length-1; j++) {
				iterationNumber++;
				if(input[j] > input[j+1]) {					
					swapNumbers(j, j+1, input);
				}
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
