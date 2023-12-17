package Lec13;

public class SubString_Method_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "Hellookaybye";
//		System.out.println(s.substring(2, 8));
//		System.out.println(s.substring(2));
//		System.out.println(s.substring(1, 1));
		String s = "Hello";
		SUbString(s);

	}

	public static void SUbString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));

			}
		}

	}

}
