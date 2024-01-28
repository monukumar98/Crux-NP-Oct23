package Lec24;

public class Power_Log_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int n = 7;
		System.out.println(pow(a, n));
	}
	public static int pow(int a, int n) {
		if (n == 1) {
			return a;
		}
		int ans = pow(a, n / 2);
		ans *= ans;
		if (n % 2 != 0) {
			ans *= a;
		}
		return ans;
	}
}
