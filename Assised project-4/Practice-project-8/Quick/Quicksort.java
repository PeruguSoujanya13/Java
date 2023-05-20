package Quick;

import java.util.Arrays;

public class Quicksort {
	public static void main(String[] args) {
		System.out.println("Quicksort demo :");

		int[] arr = { 9, 6, 3, 1, 2, 4, 5 };

		System.out.println("GIVEN ARRAY : " + Arrays.toString(arr));

		quickSort(arr, 0, arr.length - 1);

		System.out.println("SORTED ARRAY : " + Arrays.toString(arr));

	}

	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(array, left, right);
			quickSort(array, left, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, right);
		}
	}
private static int partition(int[] arr, int left, int right) {
		int pivotValue = arr[right];
		int pivotIndex = 0;

		for (int i = 0; i < right; i++) {
			if (arr[i] < pivotValue) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}
		}

		swap(arr, pivotIndex, right);

		return pivotIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

