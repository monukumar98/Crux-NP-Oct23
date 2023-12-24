package Lec14;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		int a1 = 100;
		System.out.println(a);
		System.out.println(a1);
		// Auto-Boxing
		a = a1;
		// Un-Boxing
		int b = 90;
		Integer c = 901;
		b = c;

		Integer b1 = 89;
		Integer b2 = 89;
		Integer b3 = 189;
		Integer b4 = 189;
		// Byte
		// cache
		System.out.println(b1 == b2);
		System.out.println(b3 == b4);

	}

}
