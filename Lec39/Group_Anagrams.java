package Lec39;
import java.util.*;
import java.util.HashMap;
public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] key = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Group(key));

	}

	public static List<List<String>> Group(String[] arr) {
		HashMap<String, List<String>> map = new  HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String key =KeySet(arr[i]);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(arr[i]);
			
		}
		List<List<String>> ans= new ArrayList<>();
		for(String k:map.keySet()) {
			ans.add(map.get(k));
		}
		return ans;

	}

	public static String KeySet(String key) {
		int[] freq = new int[26];
		for (int i = 0; i < key.length(); i++) {
			char ch = key.charAt(i);
			freq[ch - 'a']++;// freq[ch - 'a']=freq[ch - 'a']+1;

		}
		String s = "";
		for (int i = 0; i < freq.length; i++) {
			s = s + freq[i]+" ";
		}
		return s;
	}

}
