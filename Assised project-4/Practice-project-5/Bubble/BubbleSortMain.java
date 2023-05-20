package Bubble;

import java.util.Arrays;

public class BubbleSortMain {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 33, 1, 2, 46, 5 };

		System.out.println("GIVEN ARRAY : " + Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("SORTED ARRAY : " + Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j] ;
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}

