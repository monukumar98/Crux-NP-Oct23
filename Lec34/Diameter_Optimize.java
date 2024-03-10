package Lec34;

public class Diameter_Optimize {
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
			return diameter(root).dt;
		}

		class DiaPair {
			int dt = 0;
			int ht = -1;
		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			int sd = ldp.ht + rdp.ht + 2;
			sdp.dt = Math.max(ldp.dt, Math.max(rdp.dt, sd));
			return sdp;
		}
	}

}
