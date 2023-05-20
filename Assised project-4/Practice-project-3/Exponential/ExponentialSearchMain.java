package Exponential;

public class ExponentialSearchMain {
	
	public static void main(String[] args) {
		int arr[] = { 7, 17, 21, 23, 30, 44, 50, 77 };

		int key = 21;
		
		int indexOfKey = expSearch(arr, arr.length-1, key);
		
		if (indexOfKey != -1)
			System.out.println(key + " was found in index position " + indexOfKey);
		else
			System.out.println(key + " was not found");

	}

	private static int expSearch(int[] arr, int end, int key) {
		// Is the key found in the first index (0)
		if (arr[0] == key) {
			return 0;
		}
		
		int i=1;
		while( i< end && arr[i] <= key)
			i = i * 2;
		
		// we are here means we have found the range for the key
		// to be in.
		// Apply binarysearch now
		return ExponentialSearchMain.binarySearch(arr, i/2, Math.min(i,end), key);		
	}

	private static int binarySearch(int[] arr, int i, int min, int key) {
		// TODO Auto-generated method stub
		return 0;
	}

}
