package sort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {6, 2, 8, 1, 7, 5, 3, 4};
		
//		BubbleSort b = new BubbleSort();
//		b.bubbleSort(arr);
//		
//		b.printArray(arr);
		
		
		//int arraySize = 8;
//				SortCrunchifyArray crunchifyArray;
//				crunchifyArray = new SortCrunchifyArray(arraySize);
//				crunchifyArray.insert(6);
//				crunchifyArray.insert(2);
//				crunchifyArray.insert(8);
//				crunchifyArray.insert(1);
//				crunchifyArray.insert(7);
//				crunchifyArray.insert(5);
//				crunchifyArray.insert(3);
//				crunchifyArray.insert(4);
//
//				System.out.print("Initial array: ");
//				crunchifyArray.crunchifyLog();
//
//				crunchifyArray.crunchifySelectionSort();
//
//				System.out.print("Final array after selection sort: ");
//				crunchifyArray.crunchifyLog();

//		InsertionSort i = new InsertionSort();
//		
//		System.out.print("Before Insertion Sort: "); 	
//		i.printArray(arr);
//		i.insertSort(arr);
		
		int arr[] = {10,4,8,6,1,3,2,5,9,7};
		
		/*
		 * Recursion rs = new Recursion();
		 * 
		 * System.out.println(rs.binarySearch(arr,0 , arr.length - 1, 3));
		 */
		
		MergeSort m = new MergeSort();
		System.out.println("Input array: "+ Arrays.toString(arr));
		m.mergeSort(arr,arr.length);
		
		System.out.println("Output Array:" +Arrays.toString(arr));
		
	}
	

}
