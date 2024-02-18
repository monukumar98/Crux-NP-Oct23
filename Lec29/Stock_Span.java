package Lec29;

import java.util.*;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 4, 6, 11, 9, 6 };
		Span(arr);
	}

	public static void Span(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			if (!st.isEmpty()) {
				ans[i] = i - st.peek();
			} else {
				ans[i] = i + 1;
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}
