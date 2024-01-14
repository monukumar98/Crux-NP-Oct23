package Lec20;

public class Axis_Orbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "naan";
		System.out.println(Palindromic_Substrings(str));
	}
	public static int Palindromic_Substrings(String str) {
		int odd = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) != str.charAt(axis + orbit)) {
					break;
				}
				odd++;
			}
		}
		int even = 0;
		// even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) != str.charAt((int) (axis + orbit))) {
					break;
				}
				even++;
			}
		}
		return odd + even;
	}

}
