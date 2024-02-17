package Lec28;

public class Sum_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 9));
		System.out.println(add(2, 3.0, 7));
		System.out.println(add(2,3,4,4,9,5,5,11,6,6,8,6,4,6,1,6));
	}

	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static int add(int a, double b, int c) {
		return (int) (a + b + c);
	}
	public static int add(int x,int ...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
