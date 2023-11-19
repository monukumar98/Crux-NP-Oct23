package Lec5;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int s = sc.nextInt();
		for (int i = minf; i <= maxf; i = i + s) {
			int c = (int) ((5/ 9.0) * (i - 32));
			System.out.println(i + "\t" + c);

		}

	}

}
