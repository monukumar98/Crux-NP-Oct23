package Lec1;

public class Post_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
//		System.out.println(a++);// a = a + 1;
//		System.out.println(a);

		// int b = a + a++ + 7 - a++ - a--;
		int b = a + a-- + 7 - a++ - a-- + a++;
		System.out.println(b);

	}

}
