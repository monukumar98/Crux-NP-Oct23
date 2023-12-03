package Lec9;

public class Dutch_national_flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		DNF(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void DNF(int[] arr) {
		int i = 0;// 0 ki
		int j = arr.length - 1;// 2 ki
		int k = 0;// array pe move krne ke liye
		while (k <= j) {
			if (arr[k] == 2) {// swap (k ,j)
				int temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				j--;

			} else if (arr[k] == 1) {
				k++;
			} else {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k++;
			}
		}

	}

}
