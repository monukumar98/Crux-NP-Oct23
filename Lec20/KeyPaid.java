package Lec20;

import java.util.*;

public class KeyPaid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "236";
		List<String> ll = new ArrayList<>();
		Combinations(ques, "",ll);
		System.out.println(ll);
	}

	public static void Combinations(String ques, String ans,List<String> ll) {
		if (ques.length() == 0) {
			//System.out.print(ans + " ");
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String press = key[ch - '0'];
		for (int i = 0; i < press.length(); i++) {
			Combinations(ques.substring(1), ans + press.charAt(i),ll);
		}
	}
}
