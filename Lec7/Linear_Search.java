package Lec7;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 34, 56, 78, 11, -7, 90 };
		System.out.println(Search(arr, 506));
	}

	public static int Search(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;

	}

}
