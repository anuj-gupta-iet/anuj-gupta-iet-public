package intermediate;

import java.util.Arrays;

public class SubsetSum {
	public static void main(String[] args) {
		int[] arr = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
		Arrays.
		int n = arr.length - 1;
		boolean ans = isSubSetSum(arr, sum, n);
	}

	private static boolean isSubSetSum(int[] arr, int sum, int n) {
		if(arr[n]>sum){
			return false;
		}
		if(n<0){
			return false;
		}
		if(arr[n]==sum){
			return true;
		}
		int result = isSubSetSum(arr, sum, n-1)
		
	}
}
