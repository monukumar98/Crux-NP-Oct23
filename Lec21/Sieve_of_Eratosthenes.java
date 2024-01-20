package Lec21;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;

	}

// jis index false hoga mtlb index prime number
// true hua to index not prime number 	
	public static int count(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = prime[1] = true;
		for (int i = 2; i * i <= prime.length; i++) {
			if (!prime[i]) {// mtlb prime hai
				for (int j = 2; j * i < prime.length; j++) {
					prime[i * j] = true;
				}

			}

		}
		int ans = 0;
		for (int i = 0; i < prime.length; i++) {
			if (!prime[i]) {
				ans++;
			}
		}

		return ans;

	}

}
