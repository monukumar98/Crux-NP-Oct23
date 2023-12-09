package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int[] stall = new int[n];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);// Array sort hoga
			System.out.println(minimum_distance(stall, c));
			t--;
		}

	}

	public static int minimum_distance(int[] stall, int c) {
		int si = 0;
		int ei = stall[stall.length - 1] - stall[0];// 9-1
		int ans = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (isitpossible(stall, c, mid) == true) {
				ans = mid;
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] stall, int c, int mid) {
		// TODO Auto-generated method stub
		int cows = 1;
		int pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if (stall[i] - pos >= mid) {
				cows++;
				pos = stall[i];
			}
			if (c == cows) {
				return true;
			}
		}
		return false;
	}

}
