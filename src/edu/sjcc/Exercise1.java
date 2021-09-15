package edu.sjcc;

public class Exercise1 {

	/**
	 * @param args the command line arguments
	 */
	public static int currentSize = 0;// init current size of array
	public static int[] numbers = new int[6];// init array

	/**
	 * @author : Dang-Quang Nguyen, Trang Lam
	 * @param element
	 * @return true: false:
	 */
	public static boolean append(int element) {
		if (currentSize == numbers.length)
			return false; // Array is at maximum capacity
		numbers[currentSize++] = element;// append element into string array
		return true;
	}

	/**
	 * @author : Dang-Quang Nguyen, Trang Lam
	 * @param element
	 * @return true: false:
	 */
	public static void displayNumbers() {
		System.out.println("\n*** Numbers ***");// display title
		System.out.printf("Capacity:\t%d\nElements used:\t%d\n", numbers.length, currentSize);// display current size ,
																								// and length of array
		// loop
		for (int n = 0; n < currentSize; n++)
			System.out.printf("%s\n", numbers[n]);
	}

	public static int linearSearch(int element) {
		// loop for each elements of array
		for (int n = 0; n < currentSize; n++)
			// check each element of array and element - which need to search
			if (numbers[n] == element)
				return n; // return index of array
		// no found
		return -1;
	}

	public static boolean update(int oldValue, int newValue) {
		int searchIndex = linearSearch(oldValue);

		if (searchIndex == -1)
			return false; // Element to update is not found

		numbers[searchIndex] = newValue;
		return true;
	}

	public static boolean deleteShift(int element) {
		int searchIndex = linearSearch(element);

		if (searchIndex == -1)
			return false; // Element to update is not found

		// Shift elements
		for (int n = searchIndex; n < currentSize - 1; n++)
			numbers[n] = numbers[n + 1];

		numbers[--currentSize] = -1;
		return true;
	}

	public static boolean deleteMove(int element) {
		int searchIndex = linearSearch(element);

		if (searchIndex == -1)
			return false; // Element to update is not found

		numbers[searchIndex] = numbers[--currentSize];
		numbers[currentSize] = -1; // Set last element of array to represent empty

		return true;
	}

	public static boolean insertFront(int element) {
		if (currentSize == numbers.length)
			return false; // Array is at maximum capacity

		for (int n = currentSize; n > 0; n--)
			numbers[n] = numbers[n - 1];

		numbers[0] = element;
		currentSize++;
		return true;
	}

	public static boolean insertFrontNoShift(int element) {
		if (currentSize == numbers.length)
			return false; // Array is at maximum capacity

		numbers[currentSize++] = numbers[0];
		numbers[0] = element;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayNumbers();// display element of array
		append(6); // append element into string array
		append(2);
		append(4);
		append(3);
		append(1);
		append(-1);// append null element into string array
		displayNumbers();
		// Search
		System.out.println("-------SEARCH-----------");
		System.out.println("4 is at index: " + linearSearch(4));
		// update
		System.out.println("-------UPDATE-----------");
		System.out.println(update(4, 5));
		displayNumbers();

		// delete
		System.out.println("-------DELETE SHIFT-----------");
		System.out.println(deleteShift(6));
		System.out.println(deleteShift(7));
		displayNumbers();

		// insert
		System.out.println("-------INSERT-----------");
		append(20);
		insertFrontNoShift(50);
		displayNumbers();

		// delete
		System.out.println("-------DELETE MOVE-----------");
		System.out.println();
		System.out.println(deleteMove(5));
		displayNumbers();

		// Insert front
		System.out.println("-------INSERT FRONT-----------");
		insertFront(1);
		displayNumbers();
	}

}
