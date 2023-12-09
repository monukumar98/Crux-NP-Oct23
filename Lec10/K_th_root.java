package Lec10;

public class K_th_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 157;
		System.out.println(MaxValue(n, k));

	}

	public static int MaxValue(int n, int k) {
		int si = 1;
		int ei = n;
		int ans = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				si = mid + 1;
			} else {
				ei = mid - 1;
			}

		}
		return ans;
	}

}
