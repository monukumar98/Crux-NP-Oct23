package Lec39;

import java.util.PriorityQueue;

public class Minimum_Sum_Pair {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1 };
		System.out.println(Sum(arr));
	}

	public static int Sum(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int ans = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			ans += a + b;
			pq.add(a + b);
		}
		return ans;
	}
}
