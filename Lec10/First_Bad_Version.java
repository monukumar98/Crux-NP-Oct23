package Lec10;

public class First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {
		int si = 1;
		int ei = n;
		int ans = 0;
		while (si <= ei) {
			int mid = si + (ei - si) / 2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}
		return ans;

	}

	public boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub

		return false;
	}
}
