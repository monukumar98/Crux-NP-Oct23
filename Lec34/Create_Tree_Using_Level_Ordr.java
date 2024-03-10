package Lec34;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Ordr {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Tree_Using_Level_Ordr() {
		// TODO Auto-generated constructor stub
		CreateTree();
	}
	Scanner sc = new Scanner(System.in);
	private void CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		int e = sc.nextInt();
		Node nn = new Node();
		nn.val = e;
		root = nn;
		q.add(nn);
		while (!q.isEmpty()) {
			Node r = q.poll();// remove
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
			Node n= new Node();
			n.val=c1;
			r.left=n;
			q.add(n);
			}
			if(c2!=-1) {
				Node n= new Node();
				n.val=c2;
				r.right=n;
				q.add(n);
			}

		}

	}
}
