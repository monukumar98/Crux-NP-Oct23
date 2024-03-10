package Lec34;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return IsBst(root).bst;
		}

		public BstPair IsBst(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbstp = IsBst(root.left);
			BstPair rbstp = IsBst(root.right);
			BstPair sbstp = new BstPair();
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, root.val));
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, root.val));
			boolean isbst = lbstp.bst && rbstp.bst && lbstp.max < root.val && rbstp.min > root.val;
			sbstp.bst = isbst;
			return sbstp;
		}

		class BstPair {
			boolean bst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;

		}
	}
}
