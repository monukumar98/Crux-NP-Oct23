package Lec3;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = 0;
		int star = n;
		int row = 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// Mirroring
			if (row < n) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			System.out.println();
			row++;
		}

	}

}
