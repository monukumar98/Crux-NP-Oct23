package Lec36;

public class LinkedList<T>{
	public class Node {
		T val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addFirst(T item) {
		Node nn = new Node();
		nn.val = item;

		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addLast(T item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void addAtindex(int idx, T item) {
		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node K_1 = getNode(idx - 1);
			nn.next = K_1.next;
			K_1.next = nn;
			size++;
		}

	}

	// O(n)
	public Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// O(n)
	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(1)
	public T getFirst() {
		return head.val;
	}

	// O(1)
	public T getLastt() {
		return tail.val;
	}

	// O(N)
	public T getAtindex(int idx) {
		return getNode(idx).val;
	}

	// O(1)
	public T removeFirst() {
		T v = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return v;
	}

	// O(N)
	public T removeLast() {
		if (size == 1) {
			return removeFirst();
		} else {
			Node temp = getNode(size - 2);
			T v = tail.val;
			tail = temp;
			tail.next = null;
			size--;
			return v;

		}
	}

	public T removeatIndex(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {
			Node curr = getNode(idx);
			Node prev = getNode(idx - 1);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}
	}
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Kamlesh");
		ll.addLast("Kaju");
		ll.addLast("Raju");
		ll.addLast("Ankita");
		ll.addLast("Ankit");
		ll.Display();
	}

}











