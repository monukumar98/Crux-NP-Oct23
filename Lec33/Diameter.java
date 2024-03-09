package Lec33;

public class Diameter {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root);
		}

		public int diameter(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int ld = diameter(root.left);
			int rd = diameter(root.right);
			int sd = ht(root.left) + ht(root.right) + 2;
			return Math.max(ld, Math.max(rd, sd));

		}

		private int ht(TreeNode node) {
			if (node == null) {
				return -1;
			}
			int lh = ht(node.left);
			int rh = ht(node.right);
			return Math.max(lh, rh) + 1;

		}

	}
}
