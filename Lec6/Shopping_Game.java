package Lec6;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();// Aayush
			int m = sc.nextInt();// Harshit
			Winner(n, m);
			t--;
		}
	}

	public static void Winner(int n, int m) {// Aayush-->n , Harshit-->m
		int a = 0;
		int h = 0;
		int phone = 1;
		while (true) {
			a += phone;
			if (a > n) {
				System.out.println("Harshit");
				return;
			}
			phone++;
			h += phone;
			if (h > m) {
				System.out.println("Aayush");
				return;
			}
			phone++;
		}

	}

}
