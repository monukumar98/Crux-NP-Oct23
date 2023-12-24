package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.add(-9);
		ll.add(30);
		ll.add(50);
		Collections.sort(ll);
		System.out.println(ll);
		// for each
		for (int v : ll) {
			System.out.print(v + " ");
		}
		System.out.println();
		int[] arr = { 1, 2, 4, 2 };
		for (int v : arr) {
			System.out.print(v + " ");
		}

	}

}
