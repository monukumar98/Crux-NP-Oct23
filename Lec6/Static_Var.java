package Lec6;

public class Static_Var {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 7;
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println("WoW");
		System.out.println(val);
	}

	public static int Add(int a, int b) {

		int c = a + b;
		int val = 90;
		// val += 5;
		Static_Var.val = Static_Var.val + 5;
		return c;
	}

}
