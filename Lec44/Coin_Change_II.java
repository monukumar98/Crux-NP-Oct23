package Lec44;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 5;
		int[] coin = { 1, 2, 5 };
		int[][] dp = new int[amount + 1][coin.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coin, amount, 0, dp));
	}

	public static int Coin_Change(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}

		int inc = 0, exc = 0;
		if (amount >= coin[i]) {
			inc = Coin_Change(coin, amount - coin[i], i, dp);
		}
		exc = Coin_Change(coin, amount, i + 1, dp);
		return dp[amount][i] = inc + exc;
	}

	public static int Coin_ChangeBU(int[] coins, int amount) {
		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=1;
		}
		for (int a = 1; a< dp.length; a++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0, exc = 0;
				if (a >= coins[i-1]) {
					inc = dp[a-coins[i-1]][i];
				}
				exc =dp[a][i-1];
				dp[a][i]=inc + exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
		
	}
}





























