package Lec33;



public class Balanced {
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
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}
			boolean left = isBalanced(root.left);
			boolean right = isBalanced(root.right);
			boolean self = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return left && right && self;

		}

		public int ht(TreeNode node) {
			if (node == null) {
				return -1;
			}
			int lh = ht(node.left);
			int rh = ht(node.right);
			return Math.max(lh, rh) + 1;

		}
	}
}
