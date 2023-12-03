package Lec9;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, -1, 5, 3, 2, 1 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = min_form_ith_index(arr, i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}

	}

	public static int min_form_ith_index(int[] arr, int i) {
		int min = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[min]) {
				min = j;
			}

		}
		return min;

	}
}
