package Lec30;

public class LinkedList_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.Display();
		ll.addLast(50);
		ll.addLast(60);
		ll.Display();
		ll.addAtindex(2, -9);
		ll.Display();
	}

}
