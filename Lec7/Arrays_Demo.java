package Lec7;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr);
		// System.out.println(arr.length);// size
		// set
		arr[0] = 10;
		arr[1] = -9;
		arr[2] = 8;
		arr[3] = 11;
		arr[4] = 90;
		int[] other = arr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
	}

}
