package Lec44;

import java.util.Scanner;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(Min_Op(s, t, 0, 0));

	}

// i-->s & j-->t
	public static int Min_Op(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_Op(s, t, i + 1, j + 1);
		} else {
			int D = Min_Op(s, t, i + 1, j);
			int R = Min_Op(s, t, i + 1, j + 1);
			int I = Min_Op(s, t, i, j + 1);
			ans = Math.min(I, Math.min(R, D)) + 1;
		}
		return ans;

	}

}
