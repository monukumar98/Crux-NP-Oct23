package Lec41;

import java.util.HashMap;
import java.util.*;

public class Graph_Valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];// ai
				int v2 = edges[i][1];// bi
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			return isvaild(map);
		}

		public boolean isvaild(HashMap<Integer, List<Integer>> map) {
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				st.push(src);
				while (!st.isEmpty()) {
					// 1. remove
					int r = st.pop();// remove first
					// 2. Ignore if already visited
					if (visited.contains(r)) {
						return false;
					}
					// 3. Marked visited
					visited.add(r);
					// 4. self Work
					System.out.print(r);
					// 5. Add nbrs unvisited
					for (int nbrs : map.get(r)) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}
				}
			}
			return c == 1;
		}

	}
}
