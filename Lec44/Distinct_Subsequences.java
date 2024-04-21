package Lec44;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";// coins
		String t = "rabbit";// amount

	}

	// i --> coins-->s
	// j --> amount-->t
	public static int Count(String s, String t, int i, int j) {
		if (j == t.length()) {// amount ==0
			return 1;
		}
		if (i == s.length()) {// coin
			return 0;
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Count(s, t, i + 1, j + 1);
		}
		exc = Count(s, t, i + 1, j);
		return inc+exc;

	}

}
