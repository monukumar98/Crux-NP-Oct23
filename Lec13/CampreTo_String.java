package Lec13;

public class CampreTo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s1 = "komal";
//		String s2 = "kunal";
		String s1 = "rajesh";
		String s2 = "raj";

		System.out.println(s1.compareTo(s2));
		System.out.println(compareTo(s1, s2));

	}

	public static int compareTo(String s1, String s2) {
		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}

		}
		return s1.length() - s2.length();

	}

}
