package sort;

public class InsertionSort {

	public InsertionSort() {}

	public void insertSort(int[] arr) {
		int length = arr.length;
		int j = 0;
		for (int i = 1; i < length; i++) {
			j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			System.out.print("After pass " + i + ": ");
			printArray(arr);
		}

		System.out.print("\nAfter sorting: ");
		printArray(arr);
	}

	public void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}
}
