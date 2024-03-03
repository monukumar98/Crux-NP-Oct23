package Lec31;

public class Intersection_Linked_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode r = headA;
			ListNode v = headB;
			while (r != v) {
				if (v == null) {
					v = headA;
				} else {
					v = v.next;
				}
				if (r == null) {
					r = headB;
				} else {
					r = r.next;
				}
			}
			return r;

		}

	}
}