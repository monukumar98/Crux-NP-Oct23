package Lec24;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si = 10;
		int ei = 100;
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {
			int item = rn.nextInt(ei - si + 1) + si;
			System.out.print(item + " ");
		}
	}

}
