package edu.sjcc.week1;

public class test1 {

	public static void main(String[] args) {
		/*
		 * Assume that the holes are in the middle of 2 used elements These codes are
		 * for the case that we have a hardcoded array. And, the currentSize variable is
		 * affected by the holes if it is got by appending elements.
		 */
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
		// invoke deleteShift function
		System.out.println("Delete: " + delete(2, arr));
		displayNumbers(arr, currentSize(arr));

		printLine();
		// invoke InsertFront function
		System.out.println("Insert Front: " + insertFront(20, arr));
		displayNumbers(arr, currentSize(arr));

		printLine();
		// invoke InsertFront function
		System.out.println("Insert Front No Shift: " + insertFrontNoShift(30, arr));
		displayNumbers(arr, currentSize(arr));

	}

	/*
	 * If the holes are not counted for currentSize variable, we can create a loop
	 * go backward to find currentsize. In this case, the currentSize is a method
	 * and the performance is O(n) if the array is not full
	 */
	public static int currentSize(int[] array) {

		// a loop that an index goes backward in the array
		for (int n = array.length - 1; n >= 0; n--) {

			// return currentSize when n meets the first used element
			if (array[n] != 0) {
				return n + 1;
			}
		}
		// if there is no element in an array, return 0
		return 0;
	}

	/*
	 * a search function to get an index of an element. Once we found currentsize,
	 * the search algorithm in holes version is the same as no hole. the worst case
	 * is O(n)
	 */
	public static int linearSearch(int element, int[] array) {
		int currentSize = currentSize(array);

		/*
		 * let n be an index in the array. Based on currentSize, n goes from index 0 and
		 * stop at the last used element to find an element.
		 */
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

	/*
	 * Update algorithm. this algorithm is based on the search algorithm to find the
	 * index of an element to update. it does not have any change in the holes
	 * version. The worst case is O(n).
	 */
	public static boolean update(int oldValue, int newValue, int[] array) {

		int searchIndex = linearSearch(oldValue, array);// find an index of the element to update.

		if (searchIndex == -1)
			return false; // Element to update is not found

		array[searchIndex] = newValue;
		return true;// Element to update found and updated by a new element
	}

	/*
	 * Delete algorithm. Array in Java is reserved size which cannot be changed. So,
	 * when an element is deleted, it should be replaced by another element. In
	 * holes version, to delete an element and leave "a hole", the element to delete
	 * will be replaced by 0. It does not require to move or shift other elements to
	 * fill the hole. However, it requires to perform search algorithm to find the
	 * element to delete. Therefore, it's Big O is still O(n)
	 */
	public static boolean delete(int element, int[] array) {
		int searchIndex = linearSearch(element, array);
		// int currentSize = currentSize(array);

		if (searchIndex == -1) {
			return false; // Element to delete is not found
		} else {
			array[searchIndex] = 0;
		}
		return true;
	}

	/*
	 * Insert front and shift the rest elements to the right. Because the holes also
	 * have value which is 0, the holes are also shifted when the other elements are
	 * shifted. So, this algorithm does not change in holes version once currentSize
	 * is found. The worst case is O(n) for the holes version
	 */
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

	/*
	 * Because the holes are between 2 elements so the first index and last index in
	 * array are used elements In the insertFrontNoShift algorithm, the first
	 * element is moved to the last. Then the element to insert is inserted.
	 * Therefore, the insert algorithm in holes version does not change. To insert
	 * an element, it requires to check if the array is full or not which needs
	 * currentSize to compare. So, it's big O is O(n)
	 */
	public static boolean insertFrontNoShift(int element, int[] array) {
		int currentSize = currentSize(array);

		if (currentSize == array.length)
			return false; // Array is at maximum capacity

		array[currentSize++] = array[0];
		array[0] = element;
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
