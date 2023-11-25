package Lec6;

public class Function_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println(Add());
//		int ans = Add();
//		System.out.println(ans);
		System.out.println("Okay");

	}

	public static int Add() {
		int a = 9;
		int b = 7;
		int c = a + b;
		c = c + Sub();
		return c;
	}
	public static int Sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		return c;

	}

}
