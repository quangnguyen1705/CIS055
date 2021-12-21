package sort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {6, 2, 8, 1, 7, 5, 3, 4};
	//	int arr[] = {5, 4, 9, 2, 1, 6, 3, 7, 8, 0};
//		BubbleSort b = new BubbleSort();
//		b.bubbleSort(arr);
//		b.printArray(arr);

//		 int arraySize = 10;
//				SortCrunchifyArray crunchifyArray;
//				crunchifyArray = new SortCrunchifyArray(arraySize);
//				crunchifyArray.insert(5);
//				crunchifyArray.insert(4);
//				crunchifyArray.insert(9);
//				crunchifyArray.insert(2);
//				crunchifyArray.insert(1);
//				crunchifyArray.insert(6);
//				crunchifyArray.insert(3);
//				crunchifyArray.insert(7);
//				crunchifyArray.insert(8);
//				crunchifyArray.insert(0);
//
//				System.out.print("Initial array: ");
//				crunchifyArray.crunchifyLog();
//
//				crunchifyArray.crunchifySelectionSort();
//
//				System.out.print("Final array after selection sort: ");
//				crunchifyArray.crunchifyLog();

		
//		InsertionSort is = new InsertionSort();
//		is.insertSort(arr);
		
//		int arr[] = {10,4,8,6,1,3,2,5,9,7};

		/*
		 * Recursion rs = new Recursion();
		 * 
		 * System.out.println(rs.binarySearch(arr,0 , arr.length - 1, 3));
		 */

//		 MergeSort m = new MergeSort();
//		 System.out.println("Input array: "+ Arrays.toString(arr));
//		 m.mergeSort(arr,arr.length);
//		 System.out.println("Output Array:" +Arrays.toString(arr));

//		QuickSort qS = new QuickSort();
//		System.out.println("Before search:" + Arrays.toString(arr));
//		qS.quickSort(arr, 0, arr.length - 1);
//		System.out.println("after sort:" + Arrays.toString(arr));

		// TEST CASE 1
		int testArray1[] = { 5, 3, 6, 2, 8, 9, 4, 1 };
		System.out.println("====================TEST CASE 1=====================");
		InsertionSort i = new InsertionSort();
		System.out.print("Before Insertion Sort: ");
		i.printArray(testArray1);
		i.insertionSortRecursive(testArray1, testArray1.length);
		System.out.print("After Insertion Sort: ");
		i.printArray(testArray1);
//
//		// TEST CASE 2 : Duplicate number
//		int testArray2[] = { 6, 3, 7, 2, 1, 6, 5, 4, 9 };
//		System.out.println("====================TEST CASE 2=====================");
//		InsertionSort i2 = new InsertionSort();
//		System.out.print("Before Insertion Sort: ");
//		i2.printArray(testArray2);
//		i2.insertionSortRecursive(testArray2, testArray2.length);
//		System.out.print("After Insertion Sort: ");
//		i2.printArray(testArray2);
//
//		// TEST CASE3 : neggative number and zero number
//		int testArray3[] = { 3, 1, 5, 0, 2, -6, 4, 9, 7 };
//		System.out.println("====================TEST CASE 3=====================");
//		InsertionSort i3 = new InsertionSort();
//		System.out.print("Before Insertion Sort: ");
//		i3.printArray(testArray3);
//		i3.insertionSortRecursive(testArray3, testArray3.length);
//		System.out.print("After Insertion Sort: ");
//		i3.printArray(testArray3);
		
		

	}

}
