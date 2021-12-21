package sort;

import java.util.Arrays;

public class BubbleSort {
	
	public BubbleSort() {}

	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			System.out.println("Bubble sort  :" + i);
			System.out.println("--------------------------------");
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					System.out.println("Swap " + arr[j] + " and " +  arr[j+1] +" - " + Arrays.toString(arr));
					
				}else {
					System.out.println("No swap  - " + Arrays.toString(arr));
				}
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
