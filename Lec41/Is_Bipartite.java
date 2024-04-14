package Lec41;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				if(visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));
				while (!q.isEmpty()) {
					BipartitePair r = q.poll();
					// odd even cycle ignore steps
					if (visited.containsKey(r.vtx)) {
						if (visited.get(r.vtx) != r.dis) {
							return false;
						} else {
							continue;
						}
					}
					visited.put(r.vtx, r.dis);
					for (int nbrs : graph[r.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, r.dis + 1));
						}
					}
				}
			}
			return true;
		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.dis = dis;
		}
	}
}
