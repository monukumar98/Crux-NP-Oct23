package Lec27;

import java.util.Stack;

public class Revser_Satck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Revser(st);
		System.out.println(st);
	}

	private static void Revser(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Revser(st);
		Add(st, x);

	}

	public static void Add(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		Add(st, item);
		st.push(x);
	}

}
