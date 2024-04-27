package Lec45;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(MaxProfit(wine, 0, wine.length - 1, 1, dp));
		System.out.println(MaxProfitBU(wine));

	}

	public static int MaxProfit(int[] wine, int si, int ei, int year, int[][] dp) {
		if (si > ei) {
			return 0;
		}
		if (dp[si][ei] != 0) {
			return dp[si][ei];
		}
		int fs = wine[si] * year + MaxProfit(wine, si + 1, ei, year + 1, dp);
		int ls = wine[ei] * year + MaxProfit(wine, si, ei - 1, year + 1, dp);
		return dp[si][ei] = Math.max(ls, fs);

	}

	public static int MaxProfitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * year;
		}
		year--;
		for (int gap = 1; gap < wine.length; gap++) {
			for (int j = gap; j < wine.length; j++) {
				int i = j - gap;
				int fs = wine[i] * year + dp[i + 1][j];
				int ls = wine[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(ls, fs);
			}
			year--;
		}
		return dp[0][dp[0].length-1];
	}
}
