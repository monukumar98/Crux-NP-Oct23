package Lec38;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> ll = new ArrayList<>();
//		for(int v: ll) {
//			
//		}
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(12);
		set.add(30);
		set.add(-1);
		set.add(43);
		set.add(7);
		System.out.println(set);
//		
//		System.out.println(set.contains(77));
//		System.out.println(set.contains(7));
//		
//		System.out.println(set.remove(1));
//		System.out.println(set);
//		for(int v:set) {
//			System.out.print(v+" ");
//		}
//		
		
		TreeSet<Integer> set1= new TreeSet<>();
		set1.add(1);
		set1.add(12);
		set1.add(30);
		set1.add(-1);
		set1.add(43);
		set1.add(7);
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new  LinkedHashSet<>();
		set2.add(1);
		set2.add(12);
		set2.add(30);
		set2.add(-1);
		set2.add(43);
		set2.add(7);
		System.out.println(set2);
	}

}
