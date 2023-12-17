package Lec13;

public class String_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s2);
//		System.out.println(s4 == s3);
		s1 = s1 + "Bye";
//		s3 = s3 + s4;
		s3 = s3.concat(s4);
		String s5 = "hello" + "bye";
		String s6 = "hello" + "bye";
		System.out.println(s5 == s6);
		System.out.println(s1.length());// Method
//		int[] arr = new int[7];
//		System.out.println(arr.length);// var 
		System.out.println(s1.charAt(5));

	}

}
