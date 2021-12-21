package sort;

import java.util.Arrays;

public class MergeSort {

	public MergeSort() {
	}

	public void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

		System.out.println("");

		System.out.println("Merge -> array : " + Arrays.toString(arr) + " Left: " + Arrays.toString(left_arr)
				+ " Right: " + Arrays.toString(right_arr));
		int i = 0, l = 0, r = 0;
		// The while loops check the conditions for merging
		while (l < left_size && r < right_size) {

			if (left_arr[l] < right_arr[r]) {
				arr[i++] = left_arr[l++];
			} else {
				arr[i++] = right_arr[r++];
			}
		}
		while (l < left_size) {
			arr[i++] = left_arr[l++];
		}
		while (r < right_size) {
			arr[i++] = right_arr[r++];
		}

		System.out.println("*-*-* End of merge function >> Merge array is : " + Arrays.toString(arr));
	}

	public void mergeSort(int[] arr, int len) {
		if (len < 2) {
			System.out.println("Array has only one element " + Arrays.toString(arr) + " - no futher action");
			return;
		}

		int mid = len / 2;
		int[] left_arr = new int[mid];
		int[] right_arr = new int[len - mid];

		// Dividing array into two and copying into two separate arrays
		int k = 0;
		for (int i = 0; i < len; ++i) {
			if (i < mid) {
				left_arr[i] = arr[i];
			} else {
				right_arr[k] = arr[i];
				k = k + 1;
			}
		}
		System.out.println("Left Half : " + Arrays.toString(left_arr) + " Right Half: " + Arrays.toString(right_arr));
		System.out.println();
		// Recursively calling the function to divide the subarrays further
		System.out.println("Recursive call mergeSort for left array:" + Arrays.toString(left_arr));
		System.out.println("-------------------------------------------------------------");
		mergeSort(left_arr, mid);
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		System.out.println("Recursive call mergeSort for right array:" + Arrays.toString(right_arr));
		System.out.println("-------------------------------------------------------------");
		mergeSort(right_arr, len - mid);
		System.out.println("-------------------------------------------------------------");

		// Calling the merge method on each subdivision
		merge(left_arr, right_arr, arr, mid, len - mid);
	}
}
