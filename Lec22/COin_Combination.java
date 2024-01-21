package Lec22;

public class COin_Combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 5 };
		int amount = 5;
		CoinChanges(coin, amount, "", 0);

	}

	public static void CoinChanges(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				CoinChanges(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}
}
