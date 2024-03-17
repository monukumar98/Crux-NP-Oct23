package Lec36;

public class Pair<K, V> {
	K x;
	V y;

	@Override
	public String toString() {
		return this.x + " " + this.y;
	}

	public static void main(String[] args) {
		Pair<Integer, Character> p = new Pair<>();
		p.x = 90;
		p.y = 'v';
		System.out.println(p);

	}
}
