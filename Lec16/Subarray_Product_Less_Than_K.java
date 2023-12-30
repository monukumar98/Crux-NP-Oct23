package Lec16;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 2 };
		int k = 10;
		System.out.println(Product_Less_Than_K(arr, k));
	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int ans = 0;
		int si = 0, ei = 0;
		int p = 1;
		while (ei < arr.length) {
			p = p * arr[ei];// grow
			while (p >= k && si <= ei) {// Shrink
				p = p / arr[si];
				si++;
			}
			// ans
			ans += (ei - si + 1);
			ei++;
		}
		return ans;

	}

}
