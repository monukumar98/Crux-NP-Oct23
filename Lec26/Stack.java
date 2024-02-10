package Lec26;

public class Stack {
	private int[] arr;
	private int idx = 0;

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public boolean isEmpty() {
		return idx == 0;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol Stack full hai");
		}
		arr[idx] = item;
		idx++;
	}
public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Stack empty hai");
		}
		int rv = arr[idx - 1];
		idx--;
		return rv;
	}
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Bklol Stack empty hai");
		}
		int rv = arr[idx - 1];
		return rv;
	}

	public int size() {
		return idx;
	}

	public boolean isfull() {
		return idx == arr.length;
	}

	public void Display() {
		for (int i = 0; i < idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
