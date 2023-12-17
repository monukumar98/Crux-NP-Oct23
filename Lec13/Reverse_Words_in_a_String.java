package Lec13;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    Hello      World  cap bag   India   ";
		s = s.trim();
		System.out.println(s);
		String[] arr = s.split("\s+");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";

		}
		System.out.println(ans.trim());
	}

}
