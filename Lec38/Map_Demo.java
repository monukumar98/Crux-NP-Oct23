package Lec38;

import java.util.*;

public class Map_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		//System.out.println(map);
		// Add
		map.put("Raj", 87);
		map.put("Ankit", 98);
		map.put("Ankita", 77);
		map.put("Puneet", 58);
		map.put("Rajesh", 89);
		map.put("Pooja", 89);
		map.put("Kaju", 78);
		map.put("Kamlesh", 89);
		map.put("Kunal", 22);
		map.put("Ankita", 67);
//		// map.put(null, 79);
		System.out.println(map);
//		System.out.println(map.keySet());
		
		Set<String>s = map.keySet();
//		for(String key:s) {
//			System.out.println(key+" "+map.get(key));
//		}
		
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
//		// get
//		System.out.println(map.get("Amisha"));
//		System.out.println(map.get("Ankit"));
//       //remove
//		System.out.println(map.remove("Raj"));
//		System.out.println(map.remove("Amisha"));
//		System.out.println(map);
//		//containsKey
//		System.out.println(map.containsKey("Ankit"));
//		System.out.println(map.containsKey("Amisha"));
		
		TreeMap<String,Integer> map1= new TreeMap<>();
		map1.put("Raj", 87);
		map1.put("Ankit", 98);
		map1.put("Ankita", 77);
		map1.put("Puneet", 58);
		map1.put("Rajesh", 89);
		map1.put("Pooja", 89);
		map1.put("Kaju", 78);
		map1.put("Kamlesh", 89);
		map1.put("Kunal", 22);
		map1.put("Ankita", 67);
		//map1.put(null, 79);
		//System.out.println(map1);
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
		map2.put("Raj", 87);
		map2.put("Ankit", 98);
		map2.put("Ankita", 77);
		map2.put("Puneet", 58);
		map2.put("Rajesh", 89);
		map2.put("Pooja", 89);
		map2.put("Kaju", 78);
		map2.put("Kamlesh", 89);
		map2.put("Kunal", 22);
		map2.put("Ankita", 67);
		//System.out.println(map2);
	}

}

