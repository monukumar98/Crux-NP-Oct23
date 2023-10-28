package Lec1;

public class Pre_Inc_Dec {
	public static void main(String[] args) {
		int a = 7;
//		System.out.println(++a);
//		System.out.println(a);

		int b = a++ + ++a - ++a - --a + --a + a++ - a--;
		System.out.println(b);

	}
}
