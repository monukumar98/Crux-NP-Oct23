package Lec16;

public class Maximum_Sum_of_SubArray_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 1, 7, 9, 6, 5, 4, 3, 2 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));

	}

	public static int Maximum_Sum(int[] arr, int k) {
		int sum = 0, ans = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			// Grow
			sum += arr[i];
			// Shrink
			sum = sum - arr[i - k];
			ans = Math.max(ans, sum);
		}
		return ans;
	}

}
