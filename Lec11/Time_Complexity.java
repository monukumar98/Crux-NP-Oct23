package Lec11;

public class Time_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		int n = 79709879;
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		// Linear_Search O(N)
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}

		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base 2
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			// Log(N) base 2
			n /= 2;
		}

		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// Log(N) base 6
			n /= 2;
			n /= 3;

		}

		int k = 2;
		while (i <= n) {
			System.out.println("Hey");

			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");

			i *= k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			// O(Sqrt(N))
			System.out.println("hey");
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					// O(N^4)
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// O(log(N)) base 2
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					// O(N^2(log(N))) base 2
				}
			}
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}
		// bubble
		// Selection
		// instersion

	}

}
