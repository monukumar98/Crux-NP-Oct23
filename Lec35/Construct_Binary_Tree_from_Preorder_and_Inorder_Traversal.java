package Lec35;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);

		}

		public TreeNode Create(int[] pre, int[] in, int ilo, int ihi, int plo, int phi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			int item = pre[plo];
			TreeNode node = new TreeNode(item);
			int idx = Search(in, ilo, ihi, item);
			int e = idx - ilo;
			node.left = Create(pre, in, ilo, idx - 1, plo + 1, plo + e);
			node.right = Create(pre, in, idx + 1, ihi, plo + e + 1, phi);
			return node;

		}

		public int Search(int[] in, int lo, int hi, int item) {
			for (int i = lo; i <= hi; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return -1;
		}
	}
}
