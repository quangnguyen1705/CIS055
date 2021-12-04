package sort;

public class SortCrunchifyArray {
	private final int[] crunchifyObject;
	private int crunchifyIndex; // Default index is 0

	/**
	 * Simple constructor
	 */
	public SortCrunchifyArray(int arraySize) {
		crunchifyObject = new int[arraySize];
		crunchifyIndex = 0;
	}

	/**
	 * Insert an Array
	 */
	public void insert(int crunchifyValue) {

		crunchifyObject[crunchifyIndex++] = crunchifyValue;
	}

	/**
	 * Simple way to swap array in Java
	 */
	private void crunchifySwap(int position1, int position2) {
		int tmp = crunchifyObject[position1];
		crunchifyObject[position1] = crunchifyObject[position2];
		crunchifyObject[position2] = tmp;
	}

	/**
	 * Actual Selection Sort Logic goes here...
	 */
	public void crunchifySelectionSort() {
		int outerObj, innerObj, minObj;

		// Counter to print iteration
		int counter = 1;
		for (outerObj = 0; outerObj < crunchifyIndex - 1; outerObj++) {
			minObj = outerObj;
			for (innerObj = outerObj + 1; innerObj < crunchifyIndex; innerObj++)
				if (crunchifyObject[innerObj] < crunchifyObject[minObj]) {

					minObj = innerObj;
				}
			crunchifySwap(outerObj, minObj); // swap an object

			// Let's print array after each iteration
			log("After pass " + counter);
			counter++;
		}
	}

	private void log(String string) {
		System.out.println("========= " + string + " =========");
		crunchifyLog();
	}

	/**
	 * Let's display Array
	 */
	public void crunchifyLog() {
		for (int i = 0; i < crunchifyIndex; i++)
			System.out.print(crunchifyObject[i] + " ");
		System.out.println("\n");
	}
}
