package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		// Add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, -4);// O(N)
		System.out.println(ll);
		System.out.println(ll.size());
		// get
		System.out.println(ll.get(2));// O(1)
		// remove
		System.out.println(ll.remove(1));// O(N)
		System.out.println(ll);
		// update
		ll.set(1, -9);// O(1)
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}

	}

}
