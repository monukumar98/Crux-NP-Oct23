package Lec4;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int c = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c >= 1) {
			System.out.println("Not prime");
		} else {
			System.out.println("Prime");
		}

	}

}
