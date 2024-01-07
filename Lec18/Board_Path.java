package Lec18;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
//		PrintPath(n, 0, "");
		System.out.println("\n" + CountPath(n, 0, ""));

	}

	public static int CountPath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int c = 0;
		for (int dice = 1; dice <= 3; dice++) {
			c = c + CountPath(end, curr + dice, ans + dice);
		}
		return c;

	}

	public static void PrintPath(int end, int curr, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
		for (int dice = 1; dice <= 3; dice++) {
			PrintPath(end, curr + dice, ans + dice);
		}
//		PrintPath(end, curr + 1, ans + 1);
//		PrintPath(end, curr + 2, ans + 2);
//		PrintPath(end, curr + 3, ans + 3);

	}

}
