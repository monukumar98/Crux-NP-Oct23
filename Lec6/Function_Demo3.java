package Lec6;

public class Function_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 9;
		int b = 7;
		System.out.println(Add(a, b));
		System.out.println("WoW");
	}

	public static int Add(int a, int b) {

		int c = a + b;
		int ans = Sub(c, a);
		return c + ans;
	}

	public static int Sub(int a, int b) {

		int c = a - b;

		return c;
	}

}
