package Lec42;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Topological_Sort(int v) {
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
		for(int e:map.keySet()) {
			for(int nbrs:map.get(e).keySet()) {
				arr[nbrs]++;
			}
		}
		return arr;
	}
	public void Topological() {
		int []in =Indgree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int v =q.poll();
			System.out.print(v+" ");
			//System.out.println(v);
			for(int nbrs:map.get(v).keySet()) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
				
	}
	public static void main(String[] args) {
		Topological_Sort ts = new Topological_Sort(7);
		ts.addedge(1, 2);
		ts.addedge(1, 0);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		ts.Topological();
	}
	
}







