package Lec22;

import java.util.*;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(s, ll, ans);
		System.out.println(ans);
	}

	public static void Partitioning(String ques, List<String> ll, List<List<String>> ans) {
		if (ques.length() == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (IsPalindrome(s)) {
				ll.add(s);
				Partitioning(ques.substring(i), ll, ans);
				ll.remove(ll.size() - 1);
			}
		}
	}

	public static boolean IsPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
