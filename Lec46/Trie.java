package Lec46;

import java.util.HashMap;

public class Trie {
	class Node {
		char val;
		boolean isterminal;
		HashMap<Character, Node> child = new HashMap<>();
	}

	private Node root;

	public Trie() {
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
			} else {
				Node node = new Node();
				node.val = ch;
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;

	}

	public boolean search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return curr.isterminal;

	}

	public boolean startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}

}
