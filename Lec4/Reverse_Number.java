package Lec4;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 34567;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
