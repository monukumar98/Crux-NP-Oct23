package Lec21;

public class Prime_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(Count(n));
	}

	public static int Count(int n) {
		int ans = 0;
		for (int i = 2; i <= n; i++) {
			if (Isprime(i)) {
				ans++;
			}
		}
		return ans;
	}

	public static boolean Isprime(int n) {
		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}

			div++;
		}
		return true;

	}

}
