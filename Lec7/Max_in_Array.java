package Lec7;

public class Max_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 34, 56, 78, 11, -7, 90 };
		System.out.println(Max2(arr));

	}

	public static int Max2(int[] arr) {
		int m =Integer.MIN_VALUE ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;

	}

	public static int Max1(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;

	}

}
