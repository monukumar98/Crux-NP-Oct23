package Lec36;

import java.util.Arrays;
import java.util.Comparator;

public class Car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] ar = new Cars[5];
		ar[0] = new Cars(200, 10, "White");
		ar[1] = new Cars(1000, 20, "Black");
		ar[2] = new Cars(345, 3, "Yellow");
		ar[3] = new Cars(34, 89, "Grey");
		ar[4] = new Cars(8907, 6, "Red");
		//Sort(ar);
		Arrays.sort(ar,new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.price-o2.price;
			}
			
			
		});
		Arrays.sort(ar,new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o2.speed-o1.speed;
			}
			
			
		});
		Display(ar);
	}
	
	public static <T extends Comparable<T>>void Sort(T[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) {
				if (arr[i].compareTo(arr[i+1])>0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}

	}
	public static void Display(Cars[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
	}

}
