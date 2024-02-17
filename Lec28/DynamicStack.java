package Lec28;

import Lec26.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (super.isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				a[i] = arr[i];
			}
			arr = a;
		}
		super.push(item);
	}
}
