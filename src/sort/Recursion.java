package sort;

public class Recursion {

	int itr = 1;
	public Recursion() {}

	public int binarySearch(int nums[], int low, int high, int target) {
		
		System.out.print("\nInteration " + itr);
		itr++; 
		
		System.out.print("\nTarget: "+ target + " Low: " + low +" High: " + high);
		if (low >= high) {
			System.out.println("\nBase case low >= high met : return -1");
			return -1;
		}
		int mid = (low + high) / 2;
		System.out.print(" Mid: "+ mid);
		if (target == nums[mid])
		{
			System.out.println("\nBase case target == nums[mid] met : return -1");
			return mid;
		}
		else if (target < nums[mid])
		{
			System.out.println("\nMaking recursive call binarySearch(muns," + low + ","+ (mid - 1) +", "+target + ")");
			return binarySearch(nums, low, mid - 1, target);
		}
		else {
			System.out.println("\nMaking recursive call binarySearch(muns," + (mid + 1) + ","+ high +", "+target +")");
			return binarySearch(nums, mid + 1, high, target);
		}
		
	}

}
