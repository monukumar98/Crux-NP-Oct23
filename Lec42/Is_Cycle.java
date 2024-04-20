package Lec42;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Cycle {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Is_Cycle(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 0; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2) {
		map.get(v1).put(v2, 0);

	}

	public int[] Indgree() {
		int v = map.size();
		int[] arr = new int[v];
		for (int e : map.keySet()) {
			for (int nbrs : map.get(e).keySet()) {
				arr[nbrs]++;
			}
		}
		return arr;
	}

	public boolean IsCycle() {
		int[] in = Indgree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c = 0;
		while (!q.isEmpty()) {
			int v = q.poll();
			c++;
			for (int nbrs : map.get(v).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c!=map.size();

	}

	public static void main(String[] args) {
		Is_Cycle ts = new Is_Cycle(7);
		ts.addedge(1, 2);
		ts.addedge(1, 0);
		//ts.addedge(0, 1);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		System.out.println(ts.IsCycle());
	}

}
