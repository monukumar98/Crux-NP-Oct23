package Lec37;

public class Heap_Client {
	public static void main(String[] args) {
		Heap hp = new Heap();
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(1);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		hp.add(-4);
		hp.display();
		System.out.println(hp.remove());
		hp.display();
	}
}
