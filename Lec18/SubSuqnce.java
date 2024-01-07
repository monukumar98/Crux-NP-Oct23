package Lec18;

public class SubSuqnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		// PrintSubSuqunce(ques, "");
		// System.out.println(c);
		System.out.println("\n"+CountSubSuqunce(ques, ""));

	}

	public static int CountSubSuqunce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int a = CountSubSuqunce(ques.substring(1), ans);
		int b = CountSubSuqunce(ques.substring(1), ans + ch);
		return a + b;

	}

	// static int c = 0;

	public static void PrintSubSuqunce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			// c++;
			return;
		}
		char ch = ques.charAt(0);
		PrintSubSuqunce(ques.substring(1), ans);
		PrintSubSuqunce(ques.substring(1), ans + ch);

	}

}
