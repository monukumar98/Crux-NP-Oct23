package Lec27;

import java.util.Stack;

public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));
	}

	public static int Celebrity(int[][] arr) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {// a-->b ko jaanta hai
				st.push(b);
			} else {// a-->b ko nhi jaanta hai
				st.push(a);
			}
		}
		int candidate = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i == candidate) {
				continue;
			}
			if (arr[candidate][i] == 1) {
				return -1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == candidate) {
				continue;
			}
			if (arr[i][candidate] == 0) {
				return -1;
			}
		}
		return candidate;

	}

}
