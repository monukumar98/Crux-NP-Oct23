package Lec43;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero=min_cost(arr, 0);
		int one =min_cost(arr, 1);
		System.out.println(Math.min(zero, one));

	}

	public static int min_cost(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int f = min_cost(arr, i + 1);
		int s = min_cost(arr, i + 2);
		int ans = Math.min(f, s) + arr[i];
		return ans;
	}

}
