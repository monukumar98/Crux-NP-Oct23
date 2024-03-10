package Lec34;

public class Binary_Search_Tree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Search_Tree(int[] in) {
		// TODO Auto-generated constructor stub
		root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node node = new Node();
		node.val = in[mid];
		node.left = CreateTree(in, si, mid - 1);
		node.right = CreateTree(in, mid + 1, ei);
		return node;
	}

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70, 80 };
		Binary_Search_Tree bt = new Binary_Search_Tree(in);
	}
}






