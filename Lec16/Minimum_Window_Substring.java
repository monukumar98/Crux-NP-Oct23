package Lec16;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(MaximumWindow_Substring(s, t));

	}

	public static String MaximumWindow_Substring(String s, String t) {
		int[] freqt = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freqt[ch]++;// freqt[ch]=freqt[ch]+1;
		}
		int si = 0, ei = 0;
		int start_Index = -1;
		int len = Integer.MAX_VALUE;
		int count = 0;
		int[] freqs = new int[256];
		while (ei < s.length()) {
			// grow
			char ch = s.charAt(ei);
			freqs[ch]++;
			if (freqs[ch] <= freqt[ch]) {
				count++;
			}
			if (t.length() == count) {
				// shrink
				while (freqs[s.charAt(si)] > freqt[s.charAt(si)]) {
					freqs[s.charAt(si)]--;
					si++;
				}
				// ans
				if (len > ei - si + 1) {
					len = ei - si + 1;
					start_Index = si;
				}
			}
			ei++;
		}
		if (start_Index == -1) {
			return "";
		}
		return s.substring(start_Index, start_Index + len);

	}

}
