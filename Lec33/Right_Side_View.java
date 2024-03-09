package Lec33;

import java.util.*;

public class Right_Side_View {

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
		int depth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			View(root, 1, ll);
			return ll;
		}

		public void View(TreeNode root, int cl, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (cl > depth) {
				ll.add(root.val);
				depth = cl;
			}
			View(root.right, cl + 1, ll);
			View(root.left, cl + 1, ll);
		}
	}

}
