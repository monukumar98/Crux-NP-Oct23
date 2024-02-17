package Lec28;


public class Student {
	String name = "kaju";
	int age = 17;

	@Override
	public String toString() {
		return name + " " + age;
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
	}

}
