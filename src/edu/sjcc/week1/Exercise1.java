package edu.sjcc.week1;

public class Exercise1 {

	public static void main(String[] args) {

		// create an array with holes
		int arr[] = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[4] = 5;
		arr[6] = 7;

		// print all the number in array
		displayNumbers(arr, currentSize(arr));

		// invoke linearSearch function
		System.out.println("*++ Index of the element is: " + linearSearch(5, arr));

		printLine();// print a line
		// invoke Update function
		System.out.println("Update: " + update(3, 10, arr));
		displayNumbers(arr, currentSize(arr));// print out the array to see the update

		printLine();
		// invoke deleteMove function
		System.out.println("Delete Move: " + deleteMove(10, arr));
		displayNumbers(arr, currentSize(arr));

		printLine();
		// invoke deleteShift function
		System.out.println("Delete Shift: " + deleteShift(2, arr));
		displayNumbers(arr, currentSize(arr));

		printLine();
		// invoke InsertFront function
		System.out.println("Insert Front: " + insertFront(20, arr));
		displayNumbers(arr, currentSize(arr));

	}

	// To determine the currentSize of used elements in holes version, we create a
	// loop going from the end of the array back to the beginning.
	public static int currentSize(int[] array) {
		// write a loop that an index goes backward in the array
		for (int n = array.length - 1; n >= 0; n--) {
			// return currentSize when n meets the first used element
			if (array[n] != 0) {
				return n + 1;
			}
		}
		// if there is no element in an array, return 0
		return 0;
	}

	// write a function to get an index of an element
	public static int linearSearch(int element, int[] array) {
		int currentSize = currentSize(array);

		// let n be an index in the array. Based on currentSize, n goes from index 0 and
		// stop at the last used element to find an element
		for (int n = 0; n < currentSize; n++) {
			// if there is a matching element in the array, return the index of that
			// element.
			if (array[n] == element) {
				return n;
			}
		}
		// if there is no matching element, return -1
		return -1;

	}

	// create a method to update element. Using the search algorithm to find the old
	// value that we want to update
	public static boolean update(int oldValue, int newValue, int[] array) {
		int searchIndex = linearSearch(oldValue, array);

		if (searchIndex == -1)
			return false; // Element to update is not found

		array[searchIndex] = newValue;
		return true;// Element to update found and updated by new element
	}

	// create a method to delete an element by shifting the rest elements to fill
	// that position
	public static boolean deleteShift(int element, int[] array) {

		// find the index of element to delete
		int searchIndex = linearSearch(element, array);
		int currentSize = currentSize(array);

		if (searchIndex == -1)
			return false; // Element to delete is not found

		// shift an element to replace the element that we want to delete.
		for (int n = searchIndex; n < currentSize - 1; n++)
			array[n] = array[n + 1];

		array[--currentSize] = -1; // “Remove” last element
		return true;
	}

	// create a method to delete an element by moving the last element of an array
	// to replace it.
	public static boolean deleteMove(int element, int[] array) {

		int searchIndex = linearSearch(element, array);// find an index of an element to delete
		int currentSize = currentSize(array);

		if (searchIndex == -1)
			return false; // Element to delete is not found

		array[searchIndex] = array[--currentSize];
		array[currentSize] = -1; // “Remove” last element of array

		return true;
	}

	// create a method to insert an element to the front of the array
	public static boolean insertFront(int element, int[] array) {

		int currentSize = currentSize(array);
		if (currentSize == array.length)// check if the array is full or not
			return false; // Array is at maximum capacity

		for (int n = currentSize; n > 0; n--)
			array[n] = array[n - 1];// shift all the elements in the array 1 step to the right

		array[0] = element;// insert an element to the first position of an array.
		currentSize++;// current size increase
		return true;
	}

	// display an array and a current size of array
	public static void displayNumbers(int[] arr, int currentSize) {
		System.out.println("\n*** Numbers ***");
		System.out.printf("Capacity:\t%d\nElements used:\t%d\n", arr.length, currentSize);
		for (int n = 0; n < currentSize; n++)
			System.out.printf("%d\n", arr[n]);
	}

	public static void printLine() {
		System.out.println("-------------------------------");
	}

}
