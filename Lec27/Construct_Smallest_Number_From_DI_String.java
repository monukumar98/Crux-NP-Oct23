package Lec27;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(Construct_Smallest(s));

	}

	public static String Construct_Smallest(String s) {
		int[] ans = new int[s.length() + 1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				ans[i] = c;
				c++;
				while (!st.isEmpty()) {
					ans[st.pop()] = c;
					c++;
				}

			} else {
				st.push(i);
			}

		}
		String str = "";
		for (int i = 0; i < ans.length; i++) {
			str = str + ans[i];
		}
		return str;
	}

}
