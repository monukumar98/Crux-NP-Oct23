package Lec19;

public class Permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		PrintPermutation(ques, "");

	}

	public static void PrintPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			int val = 1;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					val = 0;
					break;
				}
			}
			if (val == 1) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				PrintPermutation(s1 + s2, ans + ch);
			}
		}

	}

}
