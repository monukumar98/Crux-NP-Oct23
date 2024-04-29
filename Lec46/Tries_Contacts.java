package Lec46;

import java.util.HashMap;

public class Tries_Contacts {
	class Node {
		char val;
		boolean isterminal;
		HashMap<Character, Node> child = new HashMap<>();
		int count = 1;
	}

	private Node root;

	public Tries_Contacts() {
		Node nn = new Node();
		nn.val = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node node = new Node();
				node.val = ch;
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;

	}

	public int  startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}
}
