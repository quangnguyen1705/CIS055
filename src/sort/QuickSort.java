package sort;

import java.util.Arrays;

public class QuickSort {

	public QuickSort() {
	}

	private int partition(int arr[], int begin, int end) {

		int pivot = arr[end];
		int i = begin - 1;
		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
				
			}
		}	
		swap(arr, i + 1, end);
		return i + 1;
	}

	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public void quickSort(int arr[], int begin, int end) {
		int partitionIndex = 0;
		if (begin < end) {
			
			partitionIndex = partition(arr, begin, end);
			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private void printArray(int arr[],  int partitionIndex) {
		int [] left_arr = new int [partitionIndex]; 
		int [] right_arr = new int [arr.length - partitionIndex];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < partitionIndex) {
				left_arr[i] = arr[i];
			}else {
				right_arr[k] = arr[i];
				k = k + 1;
			}
			
		}
		
		System.out.println("Left " + Arrays.toString(left_arr) + " Right : " + Arrays.toString(right_arr));

	}
}
