package Lec28;

public class Client {
	public static void main(String[] args) {
		// Case-1
//		P obj = new P();
//		System.out.println(obj.d);// 1
//		System.out.println(obj.d1);// 10
//		obj.fun();
//		obj.fun1();
		// case-2
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);// 10
//		System.out.println(((C) obj).d2);
//		System.out.println(((C)obj).d);
//		obj.fun();
//		obj.fun1();
//		((C)obj).fun2();
		// Case-3
//		C obj = new P();
//		System.out.println(obj.d2);
		// Case-4
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P) obj).d);
//		((P)obj).fun();
		obj.fun();
		obj.fun1();
		obj.fun2();

	}
}
