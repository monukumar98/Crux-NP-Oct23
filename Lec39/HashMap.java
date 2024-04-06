package Lec39;

import java.util.ArrayList;

public class HashMap<K, V> {

	public class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> data;
	private int size = 0;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		data = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			data.add(null);
		}

	}

	public void put(K key, V value) {
		int bn = hashfun(key);
		Node temp = data.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node node = new Node();
		node.key = key;
		node.value = value;
		temp = data.get(bn);
		node.next = temp;
		data.set(bn, node);
		size++;
		double lf = (1.0 * size) / data.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> ll = new ArrayList<>();
		for (int i = 0; i < 2 * data.size(); i++) {
			ll.add(null);
		}
		ArrayList<Node> oldlist = data;
		data = ll;
		for (Node nn : oldlist) {
			while (nn != null) {
				put(nn.key, nn.value);
				nn=nn.next;
			}
		}
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node nn : data) {
			while (nn != null) {
				s = s + nn.key + "=" + nn.value + ", ";
				nn=nn.next;
			}
		}
		s = s + "}";
		return s;
	}

	public boolean containsKey(K key) {
		int bn = hashfun(key);
		Node temp = data.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int bn = hashfun(key);
		Node temp = data.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int bn = hashfun(key);
		Node curr = data.get(bn);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			data.set(bn, curr.next);
			curr.next = null;
			size--;

		} else {
			prev.next = curr.next;
			size--;
		}
		return curr.value;

	}

	public int hashfun(K key) {
		int h = key.hashCode() % data.size();
		if (h < 0) {
			h += data.size();
		}
		return h;

	}
}
