package Lec18;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		String ans = "";
//		printans(n, ans);
		System.out.println("\n" + Countans(n, ""));

	}

	public static int Countans(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		int a = 0;
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			a = Countans(n - 1, ans + "H");
		}
		int b = Countans(n - 1, ans + "T");
		return a + b;

	}

	public static void printans(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			printans(n - 1, ans + "H");
		}
		printans(n - 1, ans + "T");

	}

}
