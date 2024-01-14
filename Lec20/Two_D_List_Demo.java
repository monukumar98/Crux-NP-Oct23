package Lec20;

import java.util.ArrayList;
import java.util.List;

public class Two_D_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			ll.add(new ArrayList<>());
		}
		System.out.println(ll);
		ll.get(2).add(5);
		ll.get(2).add(7);
		ll.get(2).add(1, -9);
		System.out.println(ll.get(2));

	}

}
