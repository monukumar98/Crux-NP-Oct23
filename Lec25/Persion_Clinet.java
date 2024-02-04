package Lec25;

public class Persion_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Person p = new Person("Raj kumar", 21);
		// System.out.println(p.name + " " + p.age);
		// p.name = "hardik";
		System.out.println(p.getName());
		p.setName("Raj");
		System.out.println(p.getName());

		Person p1 = new Person("Bklol", 20);
		// System.out.println(p1.name + " " + p1.age);
//		p1.name = "Pooja";
//		p1.age = 78;

	}

}
