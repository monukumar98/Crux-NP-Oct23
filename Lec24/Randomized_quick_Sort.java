package Lec24;

import java.util.Random;

public class Randomized_quick_Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 7, 2, 1 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i >= j) {
			return;
		}
		int idx = Partition(arr, i, j);
		Sort(arr, i, idx - 1);
		Sort(arr, idx + 1, j);
	}

	public static int Partition(int[] arr, int si, int ei) {
		Random rn = new Random();
		int p = rn.nextInt(ei - si + 1) + si;// random index
		int t = arr[ei];
		arr[ei] = arr[p];
		arr[p] = t;
		int item = arr[ei];
		int idx = si;// item ka index
		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;

	}

}
